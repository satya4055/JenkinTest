package com.sp.server;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JenkinTestApplicationTests {
	
	public static final Logger LOGGER = LoggerFactory.getLogger(JenkinTestApplication.class);

	@Test
	void testDemo() {
		LOGGER.info("testDemo() executed");
		assertEquals(true, true);
	}

}
