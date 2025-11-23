package com.learnpatterns;

/**
 * Clase cliente que utiliza el patrón Factory Method.
 */
public class Main {
    public static void main(String[] args) {

        System.out.println("***Factory Method Pattern Demo.***");

        AnimalFactory factory;
        Animal animal;

        // 1. Usar TigerFactory (Subclase Creadora) para crear un producto.
        factory = new TigerFactory();

        // 2. El método createAnimal() es llamado en la fábrica concreta,
        //    pero el cliente solo ve que el resultado es un 'Animal'.
        animal = factory.createAnimal();
        animal.displayBehavior();

        // 3. Reutilizar la variable abstracta 'factory' para la DogFactory.
        factory = new DogFactory();
        animal = factory.createAnimal();
        animal.displayBehavior();
    }
}
