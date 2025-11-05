package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springbootfirstapp1DependencyinjectApplication {

    private final Employee employee;

    Springbootfirstapp1DependencyinjectApplication(Employee employee) {
        this.employee = employee;
    }

	public static void main(String[] args) {
		ConfigurableApplicationContext run =	SpringApplication.run(Springbootfirstapp1DependencyinjectApplication.class, args);
		Employee employee = (Employee)run.getBean("employee");
		Address address = (Address) run.getBean("address");
		Address address1 = (Address) run.getBean("address1");
		Address address2 = (Address) run.getBean("address2");
//		Address address1 = (Address) run.getBean("address1");
		System.out.println("Employee:" +employee);
		//employee.enmae = "nithya";
		System.out.println("Address " +address);
	    System.out.println("Address " +address1);
	    System.out.println("Address " +address2);  //this and employee.addressone , is shows the same address(means hash code) , because i specifys the address2 object has to use 
//		address.name = "bengalure";
//		address1.name = "mysore";
//	    employee.setAddressone(address2);
//	    address2.setName("mysore");
	    address2.setName("mysore");
		System.out.println("from employee " +employee.addressone);
		System.out.println("employee name " +employee.enmae);
		
		

		System.out.println("From employee adress name " +employee.addressone.getName());
	}

}
