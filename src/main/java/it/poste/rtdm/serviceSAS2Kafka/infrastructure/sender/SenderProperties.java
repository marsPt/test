package it.poste.rtdm.serviceSAS2Kafka.infrastructure.sender;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix="rtdm.sas2kafka")
public class SenderProperties {
	private String topic;
	private String dateFormat = "dd/MM/yyyy HH:mm:ss";
	private String timeZone = "Europe/Rome";
	
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getDateFormat() {
		return dateFormat;
	}
	public void setDateFormat(String dateFormat) {
		this.dateFormat = dateFormat;
	}
	public String getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
}
