package com.learnpatterns;

/**
 * Creator Abstracto.
 * Declara el método de fábrica (`createAnimal`), que devuelve un objeto del tipo Producto (Animal).
 * También define una operación (`performCreation`) que utiliza el método de fábrica.
 */
public abstract class AnimalFactory {

    /**
     * Este es el Método de Fábrica. Las subclases lo sobreescribirán para decidir qué clase concreta instanciar.
     * Es 'protected' para que solo las subclases o clases en el mismo paquete puedan llamarlo directamente.
     * Es 'abstract' para forzar a las subclases a proporcionar una implementación.
     *
     * @return Una instancia de un subtipo de Animal.
     */
    protected abstract Animal createAnimal();

}
