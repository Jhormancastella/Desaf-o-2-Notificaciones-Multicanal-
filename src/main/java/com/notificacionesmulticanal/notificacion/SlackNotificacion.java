package com.notificacionesmulticanal.notificacion;

public class SlackNotificacion implements Notificacion {

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando notificación por Slack: " + mensaje);
    }

    @Override
    public void logNotificacion(String mensaje) {
        System.out.println("Log de notificación por Slack: " + mensaje);
    }

}