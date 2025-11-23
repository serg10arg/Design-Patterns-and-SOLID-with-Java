package com.learnpatterns;

public class FlyBehavior implements VehicleBehavior {

    @Override
    public void showDetail(Vehicle vehicle) {

        System.out.println(vehicle.getVehicleType() + " can fly now");
    }
}
