package com.learnpatterns;

public class Tiger implements Animal {

    public Tiger(String color) {

        System.out.println("\nA tiger with " + color+ " color is created.");
    }

    @Override
    public void displayBehavior() {

        System.out.println("It says: Halum.");
        System.out.println("It loves to roam in a jungle.");
    }
}
