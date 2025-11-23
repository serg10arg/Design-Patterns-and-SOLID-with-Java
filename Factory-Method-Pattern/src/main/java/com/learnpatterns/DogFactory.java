package com.learnpatterns;

/**
 * Creator Concreto.
 * Sobrescribe el método de fábrica para devolver una instancia de un Dog (Producto Concreto).
 */
public class DogFactory extends AnimalFactory {

    /**
     * Implementación del método de fábrica que crea y devuelve un objeto Dog.
     *
     * @return Una nueva instancia de Dog.
     */
    @Override
    protected Animal createAnimal() {
        return new Dog();
    }
}
