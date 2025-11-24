package com.learnpatterns;

public class Main {
    public static void main(String[] args) {

        System.out.println("***Simplifying the usage of complex system using a facade.***");

        // 1. Crear las instancias de los subsistemas.
        Asset asset = new Asset();
        LoanStatus loanStatus = new LoanStatus();

        // El cliente solo necesita instanciar el Facade (LoanApprover)
        LoanApprover loanApprover = new LoanApprover(asset, loanStatus);

        // Caso 1: Bob
        Person personBob = new Person("Bob", 5000, true);
        checkElegibility(personBob, 20000, loanApprover);
        System.out.println("----------");

        // Caso 2: Jack
        Person personJack = new Person("Jack", 70000, false);
        checkElegibility(personJack, 30000, loanApprover);
        System.out.println("----------");

        // Caso 3: Tony
        Person personTony = new Person("Tony", 125000, true);
        checkElegibility(personTony, 125500, loanApprover);
        System.out.println("----------");

    }

    // Método auxiliar para demostrar la interaccion simple del cliente.
    private static void checkElegibility(Person person, double ClaimAmount, LoanApprover approver) {

        // El cliente llama a la interfaz unifica del Facade
        String approvalStatus = approver.CheckLoanElegibility(person, ClaimAmount);

        System.out.println(person.name + "'s application status:" + approvalStatus); // Muestra el resultado final
    }
}