package com.learnpatterns;

/**
 * Subclase Concreta: ComputerScience
 * Extiende la clase plantilla (BasicEngineering).
 * Su responsabilidad es implementar los pasos específicos (abstractos)
 * que el algoritmo central (Template Method) necesita para completarse.
 */
public class ComputerScience extends BasicEngineering {

    /**
     * Sobreescribimos el método abstracto 'courseOnSpecialPaper()'.
     * Esta es la única parte variable del algoritmo del curso.
     * La clase base BasicEngineering obliga a todas las subclases a definir este paso.
     */
    @Override
    public void courseOnSpecialPaper() {
        System.out.println("3. Object-Oriented Programming");
    }
}
