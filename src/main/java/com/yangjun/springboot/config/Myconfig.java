package com.yangjun.springboot.config;

import com.yangjun.springboot.bean.Pet;
import com.yangjun.springboot.bean.User;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.*;

import javax.jws.soap.SOAPBinding;

/**
 * @author yangjun6
 * @date 2021-03-24 22:15
 */
@Configuration(proxyBeanMethods = true)
@ImportResource("classpath:beans.xml")
public class Myconfig {
    @Bean
    @ConditionalOnBean(name = "tom")
    public User user01(){
        User user =  new User("zhangsan", 18);
        user.setPet(tomcatPet());
        return user;
    }
    //@Bean("tom")
    public Pet tomcatPet(){
        return new Pet("tomcat");
    }
}
