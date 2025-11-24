package com.learnpatterns;

public class Person {

    String name;
    double assetValue;
    boolean previousLoanExist; // Indica si la persona tiene un prestamo existente

    /**
     * Constructor para inicializar los datos del solicitante
     */
    public Person(String name, double assetValue, boolean previousLoanExist) {
        this.name = name;
        this.assetValue = assetValue;
        this.previousLoanExist = previousLoanExist;
    }
}
