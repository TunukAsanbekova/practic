package com.company;

public class Main {

    public static void main(String[] args) {
         Person person = new Person ();

         person.name = "Aktilek";
         person.age = 3;
         person.bouy = 55;
         person.hair = "Black";

         person.getSound();
         person.getDance();

        System.out.println("Aty " + person.name + " , jashy " +  person.age + " , boyu " + person.bouy + ", chachynyn tusu " + person.hair);

    }
}
