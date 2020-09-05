package com.company.task2;

import com.company.task2.Human;


public class Main {


    public static void main(String[] args) {

        Hobby hobby = new Hobby("football", 2, "The game, where players kick the ball");
        Hobby hobbyFriend = new Hobby("Volleyball", 5, "Interesting game");
        Girl girl = new Girl("Nastya", 19, 1.79, 60.6, hobby);
        Friend friend = new Friend("Dima", 19, 184, 80, hobbyFriend, girl);
        friend.say();
        friend.getHobby().info();
        friend.getGirlName().tell();
    }
}
