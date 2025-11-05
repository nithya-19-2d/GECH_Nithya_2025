package com.example.springboot;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

//class BankingService implements PaymentService{
//
//	@Override
//	public void PaymentType() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}
//
//class BankPayservice implements PaymentService{
//
//	@Override
//	public void PaymentType() {
//		// TODO Auto-generated method stub
//		
//	}
//	
//}


public class NetBankingPaymentService implements  PaymentService  {

	public  NetBankingPaymentService(){
		System.out.println("netbanking object created");
		
	}
	
	@Override
	public void PaymentType() {
		System.out.println("Payment type");
		
	}

}
