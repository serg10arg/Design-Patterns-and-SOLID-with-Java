package com.learnpatterns;

public class ServicioB {
    public void hacerOtroTrabajo() {
        LoggerSistema logger = LoggerSistema.getInstance();
        logger.logMensaje("Servicio B: Primer mensaje.");
        logger.logMensaje("Servicio B: Segundo mensaje.");
        logger.logMensaje("Servicio B: Tercer mensaje.");
    }
}
