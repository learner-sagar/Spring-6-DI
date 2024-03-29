package com.example.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles({"qa", "EN"})
class EnvironmentControllerTestQA {
    @Autowired
    EnvironmentController environmentController;
    @Test
    void getEnvironment() {
        System.out.println(environmentController.getEnvironment());
    }
}