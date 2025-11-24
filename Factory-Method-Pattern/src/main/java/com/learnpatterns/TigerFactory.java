package com.learnpatterns;

/**
 * Creador Concreto (Concrete Creator).
 * Sobrescribe el método de fábrica para devolver una instancia de un producto concreto (Tiger).
 */
public class TigerFactory extends AnimalFactory {

    /**
     * Implementación del método de fábrica.
     * Esta fábrica se especializa en crear objetos de tipo Tiger.
     *
     * @return una nueva instancia de Tiger.
     */
    @Override
    protected Animal createAnimal(String color) {
        return new Tiger(color);
    }
}
