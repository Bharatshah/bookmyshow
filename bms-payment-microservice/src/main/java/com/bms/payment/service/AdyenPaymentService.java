package com.bms.payment.service;


public interface AdyenPaymentService {

	public Object authorize(Object paymentData);

	public Object makePayment(Object paymentData);
}
