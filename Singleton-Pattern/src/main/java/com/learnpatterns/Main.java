package com.learnpatterns;

public class Main {
    public static void main(String[] args) {
        ServicioA servicioA = new ServicioA();
        servicioA.hacerTrabajo();

        ServicioB servicioB = new ServicioB();
        servicioB.hacerOtroTrabajo();
    }
}
