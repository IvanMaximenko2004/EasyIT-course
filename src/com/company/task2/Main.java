package com.company.task2;

import com.company.task2.Human;


public class Main {


    public static void main(String[] args) {
        Hobby hobby = new Hobby("football", 2, "The game, where players kick the ball");
        Girl girl = new Girl("Nastya", 19, 1.79, 60.6, hobby);
        Human boy = new Boy("Dima", 20, 1.90, 85.4);
        girl.getHobby().info();

    }
}
