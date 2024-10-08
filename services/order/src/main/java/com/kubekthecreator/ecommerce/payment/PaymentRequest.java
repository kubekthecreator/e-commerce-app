package com.kubekthecreator.ecommerce.payment;

import com.kubekthecreator.ecommerce.customer.CustomerResponse;
import com.kubekthecreator.ecommerce.order.PaymentMethod;

import java.math.BigDecimal;

public record PaymentRequest(
        BigDecimal amount,
        PaymentMethod paymentMethod,
        Integer orderId,
        String orderReference,
        CustomerResponse customer
) {
}
