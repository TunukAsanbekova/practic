package com.company;

public class Main {

    public static void main(String[] args) {
         Fish fish = new Fish();
         fish.setName("farel4");
         fish.setColor("Gold");
         fish.setSize(45);
        System.out.println("Aty : "+ fish.getName() + ", tusu: " + fish.getColor() + ", razmeri: " + fish.getSize());


        Parrot parrot = new Parrot();
        parrot.setName("Golubchik");
        parrot.setColor("Blue");
        parrot.setWings("Kooz");
        parrot.setAge(2);

        System.out.println("\nAty: " + parrot.getName() + ", Tusu: " + parrot.getColor() + ", kanaty: " + parrot.getWings() + ", jashy: " + parrot.getAge());

        Dog dog = new Dog();
        dog.setName("Laika5");
        dog.setAge(11);
        dog.setColor("white");
        dog.setTail(25);

        System.out.println("\nAty: " + dog.getName() + ", jashy: " + dog.getAge() + ", tusu: " + dog.getColor() + ", kuirugu: " + dog.getTail());







    }




}
