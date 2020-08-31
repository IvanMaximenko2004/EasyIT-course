package com.company.task2;

public class Human {
    public String name;
    public int age;
    public double height;
    public double weight;


    public Human(String name, int age, double height, double weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void say(){
        System.out.println("My name is " + name + ", my age is " + age + "y, my height is " + height + "m, my weight is " + weight + "kg.");
    }
}
