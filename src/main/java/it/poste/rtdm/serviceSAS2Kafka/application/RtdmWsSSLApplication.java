package it.poste.rtdm.serviceSAS2Kafka.application;

import java.util.concurrent.Executor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@SpringBootApplication
@ComponentScan({"it.poste.rtdm"})
@EnableAsync
public class RtdmWsSSLApplication extends SpringBootServletInitializer  {

	@Autowired
	private ApplicationProperties props;

	// eliminare il commento per deploy WAR
	//	 @Override
	//	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	//	        return application.sources(RtdmWsSasToKafkaApplication.class);
	//	    }
	public static void main(String[] args) {
		SpringApplication.run(RtdmWsSSLApplication.class, args);
	}

	//Istanzia e configura l'Executor per l'esecuzione asincrona dei Service.
	@Bean
	public Executor asyncExecutor() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		// il pool size definisce il numero di richieste che possono essere servite in parallelo
		executor.setCorePoolSize(props.getCorePoolSize());
		executor.setMaxPoolSize(props.getMaxPoolSize());
		// superato il numero di richieste in coda, l'esecuzione fallisce
		executor.setQueueCapacity(props.getQueueCapacity());
		executor.setThreadNamePrefix(props.getThreadNamePrefix());
		executor.initialize();
		return executor;
	}

}
