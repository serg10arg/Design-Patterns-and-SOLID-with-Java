package com.learnpatterns;

public class ClientTempPattern {
    public static void main(String[] args) {

        System.out.println("*** Template Method Pattern Demonstration. ***\n");

        // -----------------------------------------------------------
        // PRIMERA INSTANCIA: Ciencias de la Computación
        // -----------------------------------------------------------

        // Paso 2: Crear una instancia de ComputerScience.
        // Se utiliza el tipo BasicEngineering (clase plantilla) como referencia.

        BasicEngineering computerScience = new ComputerScience();
        System.out.println("Computer Science course structure:");
        computerScience.displayCourseStructure(); // Output incluirá el paso 4
        System.out.println();

        // -----------------------------------------------------------
        // SEGUNDA INSTANCIA: Electrónica
        // -----------------------------------------------------------

        BasicEngineering electronics = new Electronics();
        System.out.println("Electronics course structure:");
        electronics.displayCourseStructure(); // Output NO incluirá el paso 4

    }
}