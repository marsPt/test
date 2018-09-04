package it.poste.rtdm.serviceSAS2Kafka.infrastructure.sender;

import  java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;

@Configuration
@EnableConfigurationProperties(SenderProperties.class)
public class SenderConfig {
	@Autowired
	private SenderProperties props;

	public ObjectMapper jsonMapper() {
		System.err.println("Initializing new ObjectMapper");
		ObjectMapper mapper = new ObjectMapper();
		DateFormat df = new SimpleDateFormat(props.getDateFormat());
		df.setTimeZone(TimeZone.getTimeZone(props.getTimeZone()));
		mapper.setDateFormat(df);
		return mapper;
	}
}
