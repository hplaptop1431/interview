package com.product.serviceImpl;

import com.product.entity.PaymentMethod;
import com.product.repository.PaymentMethodRepository;
import com.product.service.PaymentMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentMethodServiceImpl implements PaymentMethodService {

    @Autowired
    private PaymentMethodRepository paymentMethodRepository;

    @Override
    public List<PaymentMethod> getAllPaymentMethods() {
        return paymentMethodRepository.findAll();
    }

    @Override
    public PaymentMethod getPaymentMethodById(long id) {
        Optional<PaymentMethod> byId = paymentMethodRepository.findById(id);
        PaymentMethod paymentMethod = byId.get();
        return paymentMethod;
    }
}
