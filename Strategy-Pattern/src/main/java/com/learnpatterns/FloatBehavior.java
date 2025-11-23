package com.learnpatterns;

public class FloatBehavior implements VehicleBehavior {
    @Override
    public void showDetail(Vehicle vehicle) {

        System.out.println(vehicle.getVehicleType() + " can float now");
    }
}
