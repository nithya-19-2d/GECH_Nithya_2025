package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDependencyApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringBootDependencyApplication.class, args);
		SpringbootInteface bean =run.getBean(SpringbootInteface.class);
		bean.getPaymentService().PaymentType();
		//NetBankingPaymentService bean3 = (NetBankingPaymentService) run.getBean("address1");
		CreditPaymentclass bean2 =(CreditPaymentclass) run.getBean("creditPaymentclass");
		//CreditPaymentclass bean2 = run.getBean(CreditPaymentclass.class); , this also give sameanswer,Payment filed injection 
		NetBankingPaymentService bean3 = run.getBean(NetBankingPaymentService.class);
		bean2.PaymentType();
	}

}
