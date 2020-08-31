package com.company.task2;

import com.company.task2.Human;


public class Main {

    public static void main(String[] args) {
        Human girl1 = new Girl("Nastya", 19, 1.79, 60.6);
        Human boy1 = new Boy("Dima", 20, 1.90, 85.4);
        girl1.say();
        boy1.say();
    }
}
