package com.example.demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RtdmWsSas2MongoApplicationTests {

	@Test
	public void contextLoads() {
		String dummy = "dummy";
		assertThat(dummy).isEqualTo("dummy");
	}

}
