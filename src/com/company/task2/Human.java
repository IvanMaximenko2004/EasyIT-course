package com.company.task2;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Human {
    private String name;
    private int age;
    private double height;
    private double weight;

    public Human(String name, int age, double height, double weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public void tell(){
        System.out.print("I'm " + name + "'s friend.");
        System.out.println(" She is " + age + " y.o.");
    }

    public void say(){
        System.out.println("My name is " + name + ", my age is " +
                age + "y, my height is " + height + "m, my weight is " + weight + "kg.");
    }
}
