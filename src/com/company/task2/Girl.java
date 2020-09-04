package com.company.task2;

import com.sun.javafx.iio.gif.GIFImageLoader2;

public class Girl extends Human{
    private Hobby hobby;
    public Girl(String name, int age, double height, double weight, Hobby hobby) {
        super(name, age, height, weight);
        this.hobby = hobby;
    }

    public Hobby getHobby() {
        return hobby;
    }
}
