package com.learnpatterns;

/**
 * AmphibiousBehavior es una nueva estrategia que permite a un vehículo
 * operar tanto en tierra como en agua.
 * Implementa la interfaz VehicleBehavior sin requerir cambios en ella.
 */
public class AmphibiousBehavior implements VehicleBehavior {
    @Override
    public void showDetail(Vehicle vehicle) {
        System.out.println(vehicle.getVehicleType() + " has dual-capability: it can drive on land and float on water.");
    }
}
