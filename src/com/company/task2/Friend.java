package com.company.task2;

public class Friend extends Human{

    private Hobby hobby;
    public Friend(String name, int age, double height, double weight, Hobby hobby) {
        super(name, age, height, weight);
        this.hobby = hobby;
    }

    public Hobby getHobby(){
        return hobby;
    }


}
