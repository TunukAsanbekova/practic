package com.company;

public class Fish {

    private String name;
    private String color;
    private int size;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.matches("[a-zA-Z]*")) {
            System.err.println(name + " tamga menen gana jazynyz");
        } else
            this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size < 45) {
            System.err.println(name + " kaira suuga koe beruu kerek");
        }
        this.size = size;
    }


}
