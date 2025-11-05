package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDependencyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootDependencyApplication.class, args);
//		SpringbootInteface bean =run.getBean(SpringbootInteface.class);
//		bean.getPaymentService().PaymentType();
//		//NetBankingPaymentService bean3 = (NetBankingPaymentService) run.getBean("address1");
//		CreditPaymentclass bean2 =(CreditPaymentclass) run.getBean("creditPaymentclass");
//		//CreditPaymentclass bean2 = run.getBean(CreditPaymentclass.class); , this also give sameanswer,Payment filed injection 
//		NetBankingPaymentService bean3 = run.getBean(NetBankingPaymentService.class);
//		bean2.PaymentType();
		
		
		Student st1 = run.getBean(Student.class);
		System.out.println(st1.name);
		System.out.println(st1.address.city);
		System.out.println(st1.age);
		
		Student1 st = run.getBean(Student1.class);
		Address1 at1 = run.getBean(Address1.class);
		
		System.out.println(st.getName());
		
		System.out.println(st.getAddress().city +" and " +st.getAddress().state);
		
	}

}
