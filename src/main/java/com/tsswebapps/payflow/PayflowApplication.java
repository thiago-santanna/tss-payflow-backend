package com.tsswebapps.payflow;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan("com.tsswebapps.payflow.model")
@ComponentScan(basePackages = {"com.tsswebapps.payflow.*"})
@EnableJpaRepositories(basePackages = {"com.tsswebapps.payflow.repository"})
@EnableTransactionManagement
public class PayflowApplication {

	public static void main(String[] args) {
		SpringApplication.run(PayflowApplication.class, args);
	}

}
