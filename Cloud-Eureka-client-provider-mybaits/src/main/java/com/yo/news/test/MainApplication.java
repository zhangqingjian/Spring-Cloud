package com.yo.news.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.client.RestTemplate;
@EnableTransactionManagement
@EnableAutoConfiguration
@EnableDiscoveryClient
@SpringBootApplication
@ComponentScan({"com.yo.news..*","com.yo.boot.test"})
public class MainApplication
{
	@Bean
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}

	public static void main(String[] args)
	{
		SpringApplication.run(MainApplication.class, args);
	}
}
