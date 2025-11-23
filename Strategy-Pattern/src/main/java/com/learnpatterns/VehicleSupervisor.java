package com.learnpatterns;

public class VehicleSupervisor {
    private VehicleBehavior behavior;

    public VehicleSupervisor(VehicleBehavior behavior) {
        this.behavior = behavior;
    }

    public void displayDetail(Vehicle vehicle) {
        behavior.showDetail(vehicle);
    }

    public void setVehicleBehavior(VehicleBehavior behavior) {
        this.behavior = behavior;
    }
}
