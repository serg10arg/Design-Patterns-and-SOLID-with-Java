package com.learnpatterns;

public class LoanStatus {

    /**
     * Verifica si una persona tiene prestamos previos
     */
    public boolean hasPreviousLoans(Person person) {

        System.out.println("Verifying " + person.name + "'s previous loan(s) status");

        // Lógica de verificación: Retorna el estado del atributo previousLoanExist
        return person.previousLoanExist ? true : false;
    }
}
