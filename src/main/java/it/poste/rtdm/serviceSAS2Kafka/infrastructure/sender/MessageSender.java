package it.poste.rtdm.serviceSAS2Kafka.infrastructure.sender;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import it.poste.rtdm.serviceSAS2Kafka.infrastructure.kafka.RtdmProducer;
import it.poste.rtdm.serviceSAS2Kafka.schema.Data;
import it.poste.rtdm.serviceSAS2Kafka.schema.Id;
import it.poste.rtdm.serviceSAS2Kafka.schema.KafkaMessage;
import it.poste.rtdm.serviceSAS2Kafka.schema.Message;

@Service
public class MessageSender {
	private final static Logger logger = LoggerFactory.getLogger(MessageSender.class);

	@Value("${rtdm.sas2kafka.owner}")
	private static String OWNER;

	@Value("${rtdm.sas2kafka.topic}")
	private String topic;

	private RtdmProducer producer;
	private ObjectMapper jsonMapper;

	@Autowired
	public MessageSender(RtdmProducer producer,
			ObjectMapper mapper) {
		this.producer = producer;
		this.jsonMapper = mapper;
	}

	@Async
	public void sendAsync(Message sasMessage) throws Exception {
		// for testing only
		//    	logger.debug("sleeping");
		//    	Thread.sleep(5000);
		send(sasMessage);
	}

	public void send(Message sasMessage) throws Exception {
		KafkaMessage message = getKafkaMessage(sasMessage);
		String key = String.valueOf(new Date().getTime()/1000) + sasMessage.getIDCLIENTEBIC();
		producer.send(topic, key, jsonMapper.writeValueAsString(message));

		logger.debug("sent message with key '{}' to topic '{}'", key, topic);
	}

	private KafkaMessage getKafkaMessage (Message sasMsg) {
		Date current = new Date();
		KafkaMessage msg = new KafkaMessage();

		Date DT_ULT_TREATMENT_SDP = current;
		String DS_ULT_TREATMENT_SDP = null;
		Integer NR_SMS_GG_SDP = null;
		Integer NR_CONT_GG_SDP = 1;
		Date DT_SMS_ULT_TREAT_SDP = null;
		String FL_SMS_ULT_TREAT_SDP = null;
		// DS_ULT_TREATMENT_SDP
		if (sasMsg.getTREATMENTNM() != null) {
			DS_ULT_TREATMENT_SDP = sasMsg.getTREATMENTNM();
		}
		// NR_CONT_GG_SDP update
		if (sasMsg.getNRCONTGGSDP() != null) {
			NR_CONT_GG_SDP = sasMsg.getNRCONTGGSDP() + 1;
		}
		if (sasMsg.getFLTREATSMS() != null) {
			// NR_SMS_GG_SDP
			if (sasMsg.getNRSMSGGSDP() != null && sasMsg.getFLTREATSMS().equals("1")) {
				NR_SMS_GG_SDP = sasMsg.getNRSMSGGSDP() + 1;
			}
			// DT_SMS_ULT_TREAT_SDP
			if (sasMsg.getFLTREATSMS().equals("1")) {
				DT_SMS_ULT_TREAT_SDP = current;
			}
			// FL_SMS_ULT_TREAT_SDP
			if (sasMsg.getFLSMSULTTREATSDP() != null) {
				FL_SMS_ULT_TREAT_SDP = sasMsg.getFLTREATSMS();
			}
		}
		//creazione JSON
		msg.setOwner(OWNER);
		msg.setId(new Id(sasMsg.getIDCLIENTEBIC())); 
		msg.setData(new Data(NR_CONT_GG_SDP, DS_ULT_TREATMENT_SDP, DT_ULT_TREATMENT_SDP,NR_SMS_GG_SDP, DT_SMS_ULT_TREAT_SDP, FL_SMS_ULT_TREAT_SDP));
		logger.debug("Messaggio JSON creato");
		return msg;
	}
}
