package com.company.payment.infrastructure.aws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.cloud.aws.messaging.core.SnsOperations;

@Component
public class SnsProducer {

    private final SnsOperations snsOperations;

    @Autowired
    public SnsProducer(SnsOperations snsOperations) {
        this.snsOperations = snsOperations;
    }

    public void sendPaymentNotification(String message) {
        snsOperations.publish("payment-topic", message);
    }
}