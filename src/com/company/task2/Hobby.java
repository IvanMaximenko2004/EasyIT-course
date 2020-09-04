package com.company.task2;

public class Hobby {
    private String name;
    private int years;
    private String description;

    public Hobby(String name, int years, String description){
        this.name = name;
        this.years = years;
        this.description = description;
    }

    public void info (){
        System.out.println("Hobby: " + name + "years: " + "description: " + description);
    }
}
