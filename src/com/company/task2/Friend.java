package com.company.task2;

public class Friend extends Human{

    private Hobby hobby;
    private String name;
    private  int age;
    private Girl girl;
    public Friend(String name, int age, double height, double weight, Hobby hobby, Girl girl) {
        super(name, age, height, weight);
        this.hobby = hobby;
        this.name = name;
        this.age = age;
        this.girl = girl;
    }

    public Hobby getHobby(){
        return hobby;
    }

    public Girl getGirlName(){
        return girl;
    }

    public void tell(){
        System.out.println("I am a friend of "  + name);
    }
}
