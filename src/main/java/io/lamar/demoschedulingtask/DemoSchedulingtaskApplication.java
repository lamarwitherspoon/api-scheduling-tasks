package io.lamar.demoschedulingtask;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DemoSchedulingtaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSchedulingtaskApplication.class, args);
	}
}
