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
		
//		Student st = run.getBean(Student.class);
//		st.display();
		Student1 st = run.getBean(Student1.class);
		System.out.println(st.getName());
		System.out.println(st.getAge());
		System.out.println(st.getEmail());
		System.out.println(st.getAddress().getCity() +" and " +st.getAddress().getState());
		System.out.println(st.getList());
		System.out.println(st.skills);
	}

}
