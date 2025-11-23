package com.learnpatterns;

public class Main {
    public static void main(String[] args) {
        System.out.println("Strategy Pattern - Learning Objective: Dynamically change algorithm at runtime.");
        System.out.println("--------------------------------------------------------------------------");

        // 1. Create a vehicle
        Vehicle airplane = new Vehicle("Airplane");

        // 2. Create a supervisor with the initial behavior
        VehicleSupervisor supervisor = new VehicleSupervisor(new InitialBehavior());

        // 3. Display initial detail
        System.out.println("Current Behavior: Initial");
        supervisor.displayDetail(airplane);
        System.out.println();

        // 4. Change behavior to FlyBehavior at runtime
        System.out.println("Changing behavior to FlyBehavior...");
        supervisor.setVehicleBehavior(new FlyBehavior());

        // 5. Display new detail
        System.out.println("Current Behavior: Fly");
        supervisor.displayDetail(airplane);
        System.out.println();

        // 6. Change behavior to FloatBehavior at runtime
        System.out.println("Changing behavior to FloatBehavior...");
        supervisor.setVehicleBehavior(new FloatBehavior());

        // 7. Display final detail
        System.out.println("Current Behavior: Float");
        supervisor.displayDetail(airplane);
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Demonstration complete. The same supervisor object produced different outputs by swapping strategies.");
    }
}
