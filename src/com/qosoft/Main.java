package com.qosoft;

import com.qosoft.creational.factorymethod.Payment;
import com.qosoft.creational.factorymethod.PaymentFactory;
import com.qosoft.creational.factorymethod.TypePayment;

public class Main {

    public static void main(String[] args) {
	// write your code here
    testFactoryMethod();
    }

    public static void testFactoryMethod() {
        Payment payment = PaymentFactory.buildPayment(TypePayment.CARD);
        payment.doPayment();
    }
}
