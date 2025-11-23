package com.learnpatterns;

/**
 * Creator Concreto.
 * Sobrescribe el método de fábrica para devolver una instancia de un Tiger (Producto Concreto).
 */
public class TigerFactory extends AnimalFactory {

    /**
     * Implementación del método de fábrica que crea y devuelve un objeto Tiger.
     *
     * @return Una nueva instancia de Tiger.
     */
    @Override
    protected Animal createAnimal() {
        return new Tiger();
    }
}
