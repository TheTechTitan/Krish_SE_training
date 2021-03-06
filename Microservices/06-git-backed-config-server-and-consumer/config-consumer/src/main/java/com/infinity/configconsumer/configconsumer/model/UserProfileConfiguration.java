package com.infinity.configconsumer.configconsumer.model;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class UserProfileConfiguration {

    @Autowired
    Environment environment;

    public String getDefaultModel(){
        return environment.getProperty("item.default.model");
    }
    public String getMinRentPeriod(){
        return environment.getProperty("user.order.min");
    }
}
