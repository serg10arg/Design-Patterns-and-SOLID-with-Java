package com.learnpatterns;

public class Dog implements Animal {

    public Dog() {

        System.out.println("A dog is created.");
    }

    @Override
    public void displayBehavior() {

        System.out.println("It says 'woof' and wags its tail.");
    }
}
