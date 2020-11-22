package com.naga.spring.dbservice.service;

import com.naga.spring.dbservice.exception.ProductNotFoundException;
import com.naga.spring.dbservice.jparepository.PaymentRepository;
import com.naga.spring.dbservice.model.Payment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class PaymentServiceImpl implements PaymentService {

    private final Logger log= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public Payment createPayment(Payment payment) {
        return this.paymentRepository.save(payment);
    }

    @Override
    public Payment updatePayment(Payment payment) {

        Payment payment1=this.paymentRepository.findById(payment.getPaymentId()).orElseThrow(
                ()-> new ProductNotFoundException("Transaction is not found in database" )
        );


       payment1.setPaymentId(payment.getPaymentId());
                payment1.setDescription(payment.getDescription());
                payment1.setAmount(payment.getAmount());
                payment1.setPaymentDate(payment.getPaymentDate());
                payment1.setItemId(payment.getItemId());
                this.paymentRepository.save(payment1);
        return payment1;
    }

    @Override
    public List<Payment> getAllPayments() {
        return this.paymentRepository.findAll();
    }

    @Override
    public Payment getPaymentById(long paymentId) {
        Payment pay1=this.paymentRepository.findById(paymentId).orElseThrow(
                ()->new ProductNotFoundException("Payment is not available" +paymentId)
        );
        return pay1;
    }

    @Override
    public void deletePayment(long id) {

        log.info("Deleted Item" +id);
        this.paymentRepository.deleteById(id);

    }
}
