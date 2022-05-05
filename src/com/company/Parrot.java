package com.company;

public class Parrot {

    private String name;
    private String color;
    private String wings;
    private int age;


    void setName(String name) {
        this.name = name;
    }
    String getName () {
        return name;
    }
    void setColor(String color) {
        this.color = color;
    }
    String getColor () {
        return color;
    }
    void setWings (String wings) {
        this.wings = wings;
    }
    String getWings () {
        return wings;
    }
    void setAge (int age) {
        if (age < 2) {
            System.err.println(name + " Erkindikke uchuruu kerek");
        } else
            this.age = age;
    }

    int getAge () {
        return age;
    }

}
