package com.learnpatterns;

public class ServicioA {
    public void hacerTrabajo() {
        LoggerSistema logger = LoggerSistema.getInstance();
        logger.logMensaje("Servicio A: Primer mensaje.");
        logger.logMensaje("Servicio A: Segundo mensaje.");
        logger.logMensaje("Servicio A: Tercer mensaje.");
    }
}
