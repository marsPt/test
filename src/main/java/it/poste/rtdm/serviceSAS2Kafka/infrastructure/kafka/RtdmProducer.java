package it.poste.rtdm.serviceSAS2Kafka.infrastructure.kafka;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class RtdmProducer {
	private final static Logger logger = LoggerFactory.getLogger(RtdmProducer.class);

    private KafkaTemplate<String, String> kafkaTemplate;

	@Autowired
	public RtdmProducer(KafkaTemplate<String, String> kafkaTemplate) {
		this.kafkaTemplate = kafkaTemplate;
	}

    public void send(String topic, String key, String message) {
        this.kafkaTemplate.send(topic, key, message);
        logger.debug("Sent sample message '{}' to topic '{}'", message, topic);
    }
}
