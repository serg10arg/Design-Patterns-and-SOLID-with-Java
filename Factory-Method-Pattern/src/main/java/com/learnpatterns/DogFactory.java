package com.learnpatterns;

/**
 * Creador Concreto (Concrete Creator).
 * Sobrescribe el método de fábrica para devolver una instancia de un producto concreto (Dog).
 */
public class DogFactory extends AnimalFactory {

    /**
     * Implementación del método de fábrica.
     * Esta fábrica se especializa en crear objetos de tipo Dog.
     *
     * @return una nueva instancia de Dog.
     */
    @Override
    protected Animal createAnimal(String color) {
        return new Dog(color);
    }
}
