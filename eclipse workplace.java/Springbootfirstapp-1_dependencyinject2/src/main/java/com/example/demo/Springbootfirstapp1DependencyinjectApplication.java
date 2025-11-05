package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springbootfirstapp1DependencyinjectApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run =	SpringApplication.run(Springbootfirstapp1DependencyinjectApplication.class, args);
		Employee employee = (Employee)run.getBean("employee");
		Address address = (Address) run.getBean("address");
		Address address1 = (Address) run.getBean("address1");
		Address address2 = (Address) run.getBean("address2");
//		Address address1 = (Address) run.getBean("address1");
		System.out.println("Employee:" +employee);
		System.out.println("Address " +address);
	    System.out.println("Address " +address1);
	    System.out.println("Address " +address2);
//		address.name = "bengalure";
//		address1.name = "mysore";
//	    employee.setAddressone(address2);
//	    address2.setName("mysore");
		System.out.println("from employee " +employee.addressone);
		
		

		
		System.out.println("From employee adress name " +employee.addressone.getName());
	}

}
