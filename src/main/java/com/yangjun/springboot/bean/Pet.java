package com.yangjun.springboot.bean;

/**
 * @author yangjun6
 * @date 2021-03-24 22:11
 */
public class Pet {
    private String name;
    public Pet(String name){
        this.name = name;
    }
    public Pet(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
