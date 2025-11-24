package com.learnpatterns;

public class Dog implements Animal {

    public Dog(String color) {

        System.out.println("\nA dog with " + color+ " color is created.");
    }

    @Override
    public void displayBehavior() {

        System.out.println("It says: Bow-Wow.");
        System.out.println ("It prefers barking.");
    }
}
