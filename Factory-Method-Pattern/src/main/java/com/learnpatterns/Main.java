package com.learnpatterns;

/**
 * Cliente (Client).
 * El código cliente trabaja con una instancia de un creador concreto (DogFactory, TigerFactory),
 * a través de su interfaz abstracta (AnimalFactory).
 * Mientras el cliente siga trabajando con la fábrica a través de la interfaz base,
 * puedes pasarle cualquier subclase de la fábrica.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Initializing client code with DogFactory...");
        // El cliente solo conoce la fábrica abstracta, no los productos concretos.
        AnimalFactory dogFactory = new DogFactory();
        // El cliente llama al método de la plantilla, que a su vez llama al método de fábrica.
        dogFactory.createAndDisplayAnimal("yellow");

        System.out.println("Initializing client code with TigerFactory...");
        // Se puede cambiar la fábrica en tiempo de ejecución para obtener diferentes productos.
        AnimalFactory tigerFactory = new TigerFactory();
        tigerFactory.createAndDisplayAnimal("white");
    }
}
