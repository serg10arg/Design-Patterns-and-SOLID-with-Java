package com.learnpatterns;

/**
 * Creator Abstracto (Abstract Creator).
 * Declara el método de fábrica que devuelve un objeto del tipo Producto (Animal).
 * También puede contener una implementación por defecto del método de fábrica
 * y otra lógica de negocio que depende del producto.
 */
public abstract class AnimalFactory {

    /**
     * Este es el Método de Fábrica (Factory Method).
     * Es abstracto, forzando a las subclases a proporcionar una implementación.
     * Difiere la responsabilidad de la instanciación a las clases hijas concretas.
     *
     * @return una instancia de un producto (Animal).
     */
    protected abstract Animal createAnimal(String color);

    /**
     * Este es un método que utiliza el método de fábrica (createAnimal).
     * Define un esqueleto de algoritmo, delegando la creación del objeto a sus subclases,
     * pero controlando la secuencia de operaciones.
     * Esto es un ejemplo del patrón Template Method.
     */
    public void createAndDisplayAnimal(String color) {
        // Lógica común que no varía.
        System.out.println("Executing common logic from the abstract factory...");

        // Llama al método de fábrica para obtener un producto.
        // La subclase concreta que se esté usando determinará qué objeto se crea.
        Animal animal = createAnimal(color);

        // Utiliza el producto creado.
        animal.displayBehavior();

        System.out.println("Common logic finished.");
        System.out.println("-----------------------------------");
    }
}
