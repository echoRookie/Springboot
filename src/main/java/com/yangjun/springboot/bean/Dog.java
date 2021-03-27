package com.yangjun.springboot.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * @author yangjun6
 * @date 2021-03-27 14:12
 */
@Component
@Validated
//@ConfigurationProperties(prefix = "dog")
@PropertySource(value = "classpath:dog.properties")
public class Dog {
    @Value("${name}")
    private String  name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog(String name) {
        this.name = name;
    }
    public Dog(){

    }
}
