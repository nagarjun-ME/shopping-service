package com.naga.spring.dbservice.service;

import com.naga.spring.dbservice.model.Payment;


import java.util.List;

public interface PaymentService {

    Payment createPayment(Payment payment);

    Payment updatePayment(Payment payment);

    List<Payment> getAllPayments();

    Payment getPaymentById(long paymentId);

    void deletePayment(long id);
}
