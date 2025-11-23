package com.learnpatterns;

public class LoggerSistema {
    private static LoggerSistema instance;
    private int contadorMensajes = 0;

    private LoggerSistema() {
        // Constructor privado
    }

    public static LoggerSistema getInstance() {
        if (instance == null) {
            instance = new LoggerSistema();
        }
        return instance;
    }

    public void logMensaje(String mensaje) {
        contadorMensajes++;
        System.out.println("Log " + contadorMensajes + ": " + mensaje);
    }
}
