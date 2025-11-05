package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SpringbootInteface {
	
	@Qualifier("creditPaymentclass")
	@Autowired
	private  PaymentService  paymentService;   // this is the interface field dependency injection

	public SpringbootInteface() {
		super();
		System.out.println("SpringbootInteface object created");
	}

	//getter and setter
	public PaymentService getPaymentService() {
		return paymentService;
	}

	public void setPaymentService(PaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	

}
