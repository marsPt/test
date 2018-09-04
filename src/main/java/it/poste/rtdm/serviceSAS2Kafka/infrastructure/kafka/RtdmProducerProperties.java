package it.poste.rtdm.serviceSAS2Kafka.infrastructure.kafka;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
* Configuration properties read from the environment.
*/
@ConfigurationProperties(prefix="rtdm.producer")
public class RtdmProducerProperties {
	/**
	 * true to flush after each send.
	 */
	private boolean autoFlush;

	public boolean isAutoFlush() {
		return autoFlush;
	}

	public void setAutoFlush(boolean autoFlush) {
		this.autoFlush = autoFlush;
	}
}
