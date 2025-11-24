package com.learnpatterns;

/**
 * Producto Concreto (Concrete Product).
 * Una nueva implementación de la interfaz Animal.
 * Representa un nuevo tipo de objeto que nuestro sistema puede crear.
 */
public class Lion implements Animal {

    public Lion() {
        System.out.println("A lion is created.");
    }

    /**
     * Implementación del comportamiento específico del león.
     */
    @Override
    public void displayBehavior() {
        System.out.println("It roars majestically and leads the pride.");
    }
}
