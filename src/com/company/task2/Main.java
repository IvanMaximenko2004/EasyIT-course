package com.company.task2;

import com.company.task2.Human;


public class Main {


    public static void main(String[] args) {

        Girl girl = new Girl("Nastya", 19, 1.79, 60.6,
                new Hobby("Football", 2, "The game, where players kick the ball"),
                new Friend("Denis", 17, 1,75,
                        new Hobby("Volley", 4, "Good game")));
        Boy boy = new Boy("Sergei", 18, 1.80, 78.3,
                new Hobby("Tennis", 3, "Enjoy playing tennis"),
                new Friend("Daniil", 19, 1.83, 80,
                        new Hobby("Football", 3, "The game, where players kick the ball")));
        girl.getFriend().tell();
        boy.getFriend().tell();
    }
}
