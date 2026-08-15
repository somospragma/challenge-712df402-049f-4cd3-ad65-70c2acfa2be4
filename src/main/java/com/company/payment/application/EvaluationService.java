package com.company.payment.application;

import com.company.payment.infrastructure.aws.AwsConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EvaluationService {

    private final AwsConfig awsConfig;

    @Autowired
    public EvaluationService(AwsConfig awsConfig) {
        this.awsConfig = awsConfig;
    }

    public String evaluateSystem() {
        // Implementación de la evaluación del sistema existente
        return "Evaluación del sistema existente";
    }
}