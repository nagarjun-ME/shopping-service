package com.naga.spring.dbservice.restcontroller;

import com.naga.spring.dbservice.model.Payment;
import com.naga.spring.dbservice.model.Product;
import com.naga.spring.dbservice.service.PaymentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/db/pay")
public class PaymentRestApi {

    private final Logger log= LoggerFactory.getLogger(this.getClass());

    @Autowired
    private PaymentService paymentService;

    @RequestMapping("/all")
    public ResponseEntity<List<Payment>> readAllPayments()
    {
        log.info("Get all payments ");
        return ResponseEntity.ok().body(paymentService.getAllPayments());
    }

    @RequestMapping(value="/{pId}", method = RequestMethod.GET)
    public ResponseEntity<Payment> getPaymentById(@PathVariable("pId") long id)
    {
        log.info(" Finding payment with id :" + id);
        return ResponseEntity.ok().body(paymentService.getPaymentById(id));
    }

    @PostMapping("/add")
    public ResponseEntity < Payment> createPayment(@RequestBody Payment payment) {
        log.info(" Save payment with :" + payment);
        return ResponseEntity.ok().body(paymentService.createPayment(payment));
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity < Payment > updatePayment(@PathVariable long id, @RequestBody Payment payment) {
        payment.setPaymentId(id);
        log.info(" updating payment with id :" + id);
        return ResponseEntity.ok().body(paymentService.updatePayment(payment));
    }

    @DeleteMapping("/rmv/{id}")
    public HttpStatus deletePayment(@PathVariable long id) {
        log.info(" Deleting the payment with id :" + id);
        paymentService.deletePayment(id);
        return HttpStatus.OK;
    }

}
