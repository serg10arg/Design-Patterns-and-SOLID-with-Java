package com.learnpatterns;

/**
 * Clase Plantilla (Template Class): BasicEngineering
 * Define el esqueleto del algoritmo (la estructura del curso)
 * y contiene la implementación de los pasos comunes.
 * Debe ser abstracta porque contiene al menos un método abstracto.
 */
public abstract class BasicEngineering {

    // -----------------------------------------------------------
    // 1. EL MÉTODO PLANTILLA (Template Method)
    // -----------------------------------------------------------

    /**
     * Define el flujo de ejecución del algoritmo.
     * Es 'final' para evitar que las subclases alteren la secuencia de pasos.
     * De esta manera, el desarrollador mantiene el control absoluto sobre el flujo de ejecución.
     */
    public final void displayCourseStructure() {

        /*
         * La secuencia de pasos obligatoria:
         * 1. Materias Comunes (Mathematics)
         * 2. Materias Comunes (Soft skills)
         * 3. Materia Específica de la Subclase (Special Paper)
         */
        System.out.println("Definiendo la Estructura Base del Curso");

        // Paso 1: Llamada al método común (implementación concreta en la clase base)
        courseOnMathematics();
        // Paso 2: Llamada al método común (implementación concreta en la clase base)
        courseOnSoftSkills8();
        // Paso 3: Llamada al método variable (implementación diferida a la subclase)
        courseOnSpecialPaper();

        // Paso Condicional (Step-4): Controlado por el método hook.
        // Solo se ejecuta courseOnAdditionalPaper() si el hook devuelve 'true'.
        if (isAdditionalPaperNeeded()) {
            courseOnAdditionalPaper();
        }

    }


    // -----------------------------------------------------------
    // 2. PASOS COMUNES (Métodos Concretos)
    // -----------------------------------------------------------

    /**
     * Implementación de un paso común (Matemáticas).
     * Se define como 'private' para que solo el Template Method lo pueda llamar
     * y para asegurar que las subclases no puedan anular o redefinir este paso.
     * Esto evita código redundante y centraliza la lógica común.
     */

    private void courseOnMathematics() {
        System.out.println("1. Mathematics");
    }

    private void courseOnSoftSkills8() {
        System.out.println("2. Soft Skills");
    }

    // -----------------------------------------------------------
    // Pasos Opcionales y Métodos Hook (Ganchos)
    // -----------------------------------------------------------

    /**
     * Paso Opcional: Implementación concreta y privada del curso adicional.
     */
    private void courseOnAdditionalPaper() {
        System.out.println("4. Compiler construction.");
    }

    /**
     * Método Hook (Gancho): Permite a las subclases controlar si el paso opcional
     * courseOnAdditionalPaper() debe ejecutarse.
     * Por defecto, devuelve 'true' (el curso adicional es necesario).
     * Este es el comportamiento por defecto que las subclases pueden anular.
     */
    public boolean isAdditionalPaperNeeded() {
        return true;
    }


    // -----------------------------------------------------------
    // 3. PASOS VARIABLES (Método Abstracto)
    // -----------------------------------------------------------

    /**
     * Este es el paso que varía según la rama de ingeniería elegida.
     * Se define como 'abstract' para obligar a las subclases a proporcionar
     * su propia implementación (redefinir este paso).
     * Es 'public' ya que debe ser visible para ser implementado en las subclases.
     */
    public abstract void courseOnSpecialPaper();
}
