package com.product.controller;

import com.product.entity.Payment;
import com.product.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pay")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping("/pay")
    public ResponseEntity<String> processPayment(@RequestBody Payment payment){
       Payment processedPayment = paymentService.processPayment(payment);
       if(processedPayment==null){
           return ResponseEntity.notFound().build();
       }
       return ResponseEntity.ok("Payment Successful");
    }
}
