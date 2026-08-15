package com.company.payment.infrastructure.aws;

import java.time.LocalDateTime;

public record PaymentMessageDto(String paymentId, double amount, LocalDateTime timestamp) {}