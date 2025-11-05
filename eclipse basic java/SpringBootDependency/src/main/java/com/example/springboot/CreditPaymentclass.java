package com.example.springboot;

import org.springframework.stereotype.Component;

@Component
public class CreditPaymentclass implements PaymentService {

	@Override
	public void PaymentType() {
		System.out.println("payment field injection");
		
	}

}
