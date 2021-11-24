package com.sp.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinTestApplication {
	
	public static final Logger LOGGER = LoggerFactory.getLogger(JenkinTestApplication.class);

	public static void main(String[] args) {
		LOGGER.info("inside main()");
		SpringApplication.run(JenkinTestApplication.class, args);
	}

}
