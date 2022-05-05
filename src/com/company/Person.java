package com.company;

public class Person {

    private String name;
    private int age;
    private int bouy;
    private String hair;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (!name.matches("[a-zA-Z]*")){
            System.err.println(name+ " tamga mene gana jazynyz");
        }else
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age<2){
            System.err.println(name+" satikke jashy jete elek!");
        }else
        this.age = age;
    }

    public int getBouy() {
        return bouy;
    }

    public void setBouy(int bouy) {
        if (bouy < 55) {
            System.out.println(name + " vitamin beruu kerek");
        }
        this.bouy = bouy;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }
}
