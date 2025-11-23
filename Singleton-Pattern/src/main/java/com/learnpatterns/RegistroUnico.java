package com.learnpatterns;

public class RegistroUnico {
    // La instancia se crea cuando la clase es cargada por la JVM.
    private static final RegistroUnico uniqueInstance = new RegistroUnico();

    private RegistroUnico() {
        // Constructor privado para prevenir la instanciación.
    }

    public static RegistroUnico getInstance() {
        // Simplemente se devuelve la instancia ya creada.
        return uniqueInstance;
    }
}
