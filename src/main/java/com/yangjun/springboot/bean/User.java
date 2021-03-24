package com.yangjun.springboot.bean;

/**
 * @author yangjun6
 * @date 2021-03-24 22:10
 */
public class User {
    public String getName() {
        return name;
    }

    public User() {
    }

    public User(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private String name;
    private int age;

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    private Pet pet;

}
