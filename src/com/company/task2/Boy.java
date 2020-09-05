package com.company.task2;

public class Boy extends Human{

    private Hobby hobby;
    public Boy(String name, int age, double height, double weight, Hobby hobby) {
        super(name, age, height, weight);
        this.hobby = hobby;
    }

    @Override
    public void say() {
        super.say();
    }
    public Hobby getHobby() {
        return hobby;
    }
}
