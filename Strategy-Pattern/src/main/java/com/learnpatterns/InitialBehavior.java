package com.learnpatterns;

public class InitialBehavior implements VehicleBehavior {

    @Override
    public void showDetail(Vehicle vehicle) {

        System.out.println(vehicle.getVehicleType() + " is in born state");
        System.out.println("It cannot do anything special");

    }
}
