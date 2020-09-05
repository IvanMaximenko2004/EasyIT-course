package com.company.task2;

import com.company.task2.Human;


public class Main {


    public static void main(String[] args) {

        Friend friend = new Friend("Dima", 17, 1.84, 80, new Hobby("Volleyball", 5, "Intr game"));
        Girl girl = new Girl("Nastya", 19, 1.79, 60.6, new Hobby("Football", 2, "The game, where players kick the ball"), friend);
        Boy boy = new Boy("Sergei", 18, 1.80, 78.3, new Hobby("Tennis", 3, "Enjoy playing tennis"), friend);
        girl.getFriend().tell();
    }
}
