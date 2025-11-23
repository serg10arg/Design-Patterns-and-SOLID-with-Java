package com.learnpatterns;

public class Tiger implements Animal {

    public Tiger() {
        System.out.println("A tiger is created.");
    }

    @Override
    public void displayBehavior() {
        System.out.println("It roars and hunts.");
    }
}
