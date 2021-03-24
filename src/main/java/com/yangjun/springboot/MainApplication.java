package com.yangjun.springboot;

import com.yangjun.springboot.bean.Pet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Arrays;
import java.util.Optional;

/**
 * @author yangjun6
 * @date 2021-03-22 23:08
 */
@SpringBootApplication(scanBasePackages = "com.yangjun.springboot")
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run =  SpringApplication.run(MainApplication.class, args);
        Arrays.stream(run.getBeanDefinitionNames()).forEach(t -> System.out.println(t));

        System.out.println("usero1 " + run.containsBean("user01"));

        //从容器中获取组件
        //Optional<Pet> tom = Optional.ofNullable(run.getBean("tom", Pet.class)) ;


    }
}
