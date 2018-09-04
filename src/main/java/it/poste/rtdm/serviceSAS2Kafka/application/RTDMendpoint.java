package it.poste.rtdm.serviceSAS2Kafka.application;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import it.poste.rtdm.serviceSAS2Kafka.infrastructure.sender.MessageSender;
import it.poste.rtdm.serviceSAS2Kafka.schema.EsitoType;
import it.poste.rtdm.serviceSAS2Kafka.schema.SendSASRequest;
import it.poste.rtdm.serviceSAS2Kafka.schema.SendSASResponse;

@Endpoint
public class RTDMendpoint {
	private static final Logger logger = LoggerFactory.getLogger(RTDMendpoint.class);
	private static final String NAMESPACE_URI = "http://localhost/WSSAS2KAFKA";

	@Value("${rtdm.sas2kafka.async-send:false}")
	private boolean asyncSend;

	@Autowired
	private MessageSender sender;

	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "SendSASRequest")
	@ResponsePayload
	public SendSASResponse sendNFEA(@RequestPayload SendSASRequest sasRequest)
			throws Exception {
		SendSASResponse response = new SendSASResponse();

		try {
			if (asyncSend) {
				sender.sendAsync(sasRequest.getMessage());
			} else {
				sender.send(sasRequest.getMessage());
			}
			logger.debug("Chiamata asincrona del sender Kafka effettuata");
			response.setEsito(EsitoType.OK);
		} catch (Exception e) {
			// catch and rethrow only to log errors
			logger.error("Error sending message ({})", e.toString());
			logger.debug("Error details: ", e);
			response.setEsito(EsitoType.KO);
			return response;
		}
		return response;
	}
}