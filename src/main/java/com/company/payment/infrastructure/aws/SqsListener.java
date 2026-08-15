package com.company.payment.infrastructure.aws;

import org.springframework.cloud.aws.messaging.listener.annotation.SqsListener;
import org.springframework.stereotype.Component;

@Component
public class SqsListener {

    @SqsListener("payment-queue")
    public void listen(String message) {
        // Procesar el mensaje de pago
        System.out.println("Mensaje recibido: " + message);
    }
}