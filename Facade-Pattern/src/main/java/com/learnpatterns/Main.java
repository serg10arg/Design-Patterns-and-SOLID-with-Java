package com.learnpatterns;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // 1. Definición del Solicitante y Monto
        Person bob = new Person("Bob", 5000, true);
        double claimAmountBob= 20000;

        System.out.println("--- Proceso de Verificacion Larga (Sin Facade) ---");
        System.out.println("Solicitante: " + bob.name + ". Monto Solicitado: $" + claimAmountBob);

        // 2. El cliente debe instanciar MÚLTIPLES subsistemas directamente.
        // Esto expone al cliente a los detalles internos del sistema.
        Asset assetChecker = new Asset();
        LoanStatus loanStatusChecker = new LoanStatus();

        // Variable para almacenar los resultados
        boolean elegibleByAsset;
        boolean elegibleByPreviousLoan;
        String finalStatus = "Approved";
        String reasons = "";

        // 3. El cliente debe recordar la SECUENCIA y LÓGICA de llamadas.
        // Lógica de verificación de Activos
        elegibleByAsset = assetChecker.hasSufficientAssetValue(bob, claimAmountBob);

        if (!elegibleByAsset) {
            finalStatus = "Not approved";
            reasons += "\nInsufficient balance."; // Criterio 1: Activos insuficientes
        }

        // Lógica de verificación de Préstamo Anterior
        elegibleByPreviousLoan = !loanStatusChecker.hasPreviousLoans(bob);

        if (!elegibleByPreviousLoan) {
            finalStatus = "Not approved";
            reasons += "\nAn old loan exists."; // Criterio 2: Préstamo existente
        }

        // 4. Mostrar el resultado final al cliente
        System.out.println("\n*** RESULTADO PARA " + bob.name + " ***");
        System.out.println("Estado Final: " + finalStatus);

        if (!reasons.isEmpty()) {
            System.out.println("Razones para la denegacion:" + reasons);
        }

    }
}