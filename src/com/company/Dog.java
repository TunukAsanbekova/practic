package com.company;

public class Dog {

    private String name;
    private int age;
    private String color;
    private int tail;

    void setName (String name) {
        if (!name.matches("[a-zA-Z]*")) {
            System.err.println(name + " tamga menen gana jazynyz");
        } else
            this.name = name;
    }
    String getName (){
        return name;
    }
    void setAge (int age) {
        if (age > 10) {
            System.err.println(name + " Kaarydy, ui kaitara albait");
        } else
            this.age = age;
    }
    int getAge () {
        return age;
    }
    void setColor (String color) {
        this.color = color;
    }
    String getColor () {
        return color;
    }
    void setTail (int tail) {
        if (tail > 20) {
            System.err.println(name + " Kuirugun kesuu kerek");
        } else
            this.tail = tail;
    }
    int getTail () {
        return tail;
    }
}
