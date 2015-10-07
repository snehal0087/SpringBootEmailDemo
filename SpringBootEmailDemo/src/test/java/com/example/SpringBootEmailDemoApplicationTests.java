package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.demo.SpringBootEmailDemoApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = SpringBootEmailDemoApplication.class)
@WebAppConfiguration
public class SpringBootEmailDemoApplicationTests {

	@Test
	public void contextLoads() {
	}

}
