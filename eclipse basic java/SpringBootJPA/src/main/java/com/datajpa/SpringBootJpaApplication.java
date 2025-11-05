package com.datajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootJpaApplication {

    private final Springdata springdata;

    SpringBootJpaApplication(Springdata springdata) {
        this.springdata = springdata;
    }

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootJpaApplication.class, args);
		Springdata bean = run.getBean(Springdata.class);
		//bean.Studentsave();
		//bean.getStudent();
		//bean.getAllStudent();
		bean.getstudentbyemail();
		
	}

}
