package com.kubekthecreator.ecommerce.payment;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PaymentMapper {

    public Payment toPayment(PaymentRequest request) {
        if (request == null) {
            return null;
        }
        return Payment.builder()
                .id(request.id())
                .paymentMethod(request.paymentMethod())
                .createdDate(LocalDateTime.now())
                .amount(request.amount())
                .orderId(request.orderId())
                .build();
    }
}
