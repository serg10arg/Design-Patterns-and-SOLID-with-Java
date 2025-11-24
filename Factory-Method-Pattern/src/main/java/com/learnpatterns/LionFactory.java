package com.learnpatterns;

/**
 * Creador Concreto (Concrete Creator).
 * Una nueva fábrica que extiende la fábrica abstracta.
 * Está abierta a la extensión porque podemos añadirla sin modificar el código existente.
 */
public class LionFactory extends AnimalFactory {

    /**
     * Implementación del método de fábrica para crear un león.
     * La nueva fábrica proporciona su propia implementación del método de fábrica,
     * cumpliendo con el contrato definido por la superclase.
     *
     * @return una nueva instancia de Lion.
     */
    @Override
    protected Animal createAnimal() {
        return new Lion();
    }
}
