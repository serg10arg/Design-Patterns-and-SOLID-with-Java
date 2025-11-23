package com.learnpatterns;

public class RegistroUnico {
    private static RegistroUnico uniqueInstance;

    private RegistroUnico() {
        // Constructor privado para prevenir la instanciación.
    }

    public static RegistroUnico getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new RegistroUnico();
        }
        return uniqueInstance;
    }
}
