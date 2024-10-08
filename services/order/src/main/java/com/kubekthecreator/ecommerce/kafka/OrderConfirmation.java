package com.kubekthecreator.ecommerce.kafka;

import com.kubekthecreator.ecommerce.customer.CustomerResponse;
import com.kubekthecreator.ecommerce.order.PaymentMethod;
import com.kubekthecreator.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}
