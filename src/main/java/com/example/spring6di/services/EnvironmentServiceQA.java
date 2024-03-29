package com.example.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("qa")
public class EnvironmentServiceQA implements EnvironmentService{
    @Override
    public String getEnvironment() {
        return "qa";
    }
}
