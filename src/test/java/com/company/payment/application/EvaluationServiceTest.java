package com.company.payment.application;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
public class EvaluationServiceTest {

    @Autowired
    private EvaluationService evaluationService;

    @Test
    public void testEvaluateSystem() {
        assertNotNull(evaluationService.evaluateSystem());
    }
}