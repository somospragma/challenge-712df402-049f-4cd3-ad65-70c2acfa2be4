package com.company.payment.infrastructure.aws;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.aws.messaging.config.annotation.EnableSqs;
import org.springframework.cloud.aws.messaging.config.annotation.EnableSns;

@Configuration
@EnableSqs
@EnableSns
public class AwsConfig {

    @Value("${aws.region}")
    private String region;

    @Bean
    public SqsListener sqsListener() {
        return new SqsListener();
    }

    @Bean
    public SnsProducer snsProducer() {
        return new SnsProducer();
    }
}