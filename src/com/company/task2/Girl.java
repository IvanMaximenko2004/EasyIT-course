package com.company.task2;

public class Girl extends Human{
    private Hobby hobby;
    private Friend friend;
    public Girl(String name, int age, double height, double weight, Hobby hobby, Friend friend) {
        super(name, age, height, weight);
        this.hobby = hobby;
        this.friend = friend;
    }

    public Friend getFriend(){
        return friend;
    }

    public Hobby getHobby() {
        return hobby;
    }
}
