package it.poste.rtdm.serviceSAS2Kafka.infrastructure.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

@Configuration
@EnableConfigurationProperties(RtdmProducerProperties.class)
public class RtdmProducerConfig {
	@Autowired
	private RtdmProducerProperties producerProperties;
	
	@Autowired
	private ProducerFactory<String, String> producerFactory;
	
	@Bean
	public KafkaTemplate<String, String> kafkaTemplate() {
		return new KafkaTemplate<>(producerFactory, producerProperties.isAutoFlush());
	}
}
