package com.alasdoo.developercourseassignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = "com.alasdoo")
@EnableJpaRepositories("com.alasdoo")
@SpringBootApplication
public class DeveloperCourseAssignment {

	public static void main(String[] args) {
		SpringApplication.run(DeveloperCourseAssignment.class, args);
	}
}
