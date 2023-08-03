package com.product.controller;

import com.product.entity.PaymentMethod;
import com.product.service.PaymentMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
public class PaymentMethodController {

    @Autowired
    private PaymentMethodService paymentMethodService;

    @GetMapping("/payment-methods")
    public List<PaymentMethod> getAllPaymentMethod(){
      return paymentMethodService.getAllPaymentMethods();
    }

    @GetMapping("/payment-method/{id}")
    public ResponseEntity<PaymentMethod> getPaymentMethodById(@PathVariable("id") long id){
       PaymentMethod paymentMethod = paymentMethodService.getPaymentMethodById(id);

       if(paymentMethod==null){
           return ResponseEntity.notFound().build();
       }
       return ResponseEntity.ok(paymentMethod);
    }

}
