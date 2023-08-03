package com.product.service;

import com.product.entity.PaymentMethod;

import java.util.List;

public interface PaymentMethodService {
    public List<PaymentMethod> getAllPaymentMethods();

    public PaymentMethod getPaymentMethodById(long id);

}
