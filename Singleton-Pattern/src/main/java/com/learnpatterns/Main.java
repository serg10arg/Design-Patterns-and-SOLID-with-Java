package com.learnpatterns;

public class Main {
    public static void main(String[] args) {
        RegistroUnico registro1 = RegistroUnico.getInstance();
        RegistroUnico registro2 = RegistroUnico.getInstance();

        System.out.println("¿Son la misma instancia? " + (registro1 == registro2));
    }
}
