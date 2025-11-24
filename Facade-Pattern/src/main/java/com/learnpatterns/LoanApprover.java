package com.learnpatterns;

// La clase Facade: El orquestador
public class LoanApprover {

    // Declaración de las referencias a los subsistemas.
    // Estas son las interfaces que el Facade debe manejar internamente
    Asset asset;
    LoanStatus loanStatus;

    // Implementación de la COMPOSICIÓN
    public LoanApprover(Asset asset, LoanStatus loanStatus) {

        // Inicializa las instancias de los subsistemas dentro del facade
        // Esto garantiza que el Facade pueda acceder a los métodos de cada subsistema
        this.asset = asset;
        this.loanStatus = loanStatus;
    }

    // La interfaz unificada y la orquestación de la lógica de negocio
    // Proporciona un único punto de entrada simplificado para verificar la elegibildiad de un préstamo
    // Ocultado la complejidad interna
    public String CheckLoanElegibility(Person person, double claimAmount) {

        String status = " Approved"; // Estado inicial optimista
        String reason = ""; // Razones de rechazo

        System.out.println("\nChecking the loan approval status of " + person.name);
        System.out.println("[The current asset value: " + person.assetValue +
                ", claim amount: " + claimAmount +
                ",\n existing loan?: " + person.previousLoanExist +
                "]\n");

        // Lógica de Orquestación 1: Verificación de Activos
        // El Facade llama al método del subsistema 'Asset'
        if (!asset.hasSufficientAssetValue(person, claimAmount)) {
            status = " Not approved";
            reason += "\nInsufficient balance.";
        }

        // Logica de Orquestación 2: Verificación de Préstamos Previos
        if (loanStatus.hasPreviousLoans(person)) {
            status = " Not approved";
            reason += "\nAn old loan exists.";
        }

        // El facade combina los resultados de los subsistemas en una respuesta unica
        String remarks = String.format("%nRemarks if any:%s", reason);
        String result = String.format("%s %s", status, remarks);

        return result;
    }
}
