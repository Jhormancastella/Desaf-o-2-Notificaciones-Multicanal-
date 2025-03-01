package com.notificacionesmulticanal.notificacion;

public class TelegramNotificacion implements    Notificacion {

    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando notificación por Telegram: " + mensaje);
    }

    @Override
    public void logNotificacion(String mensaje) {
        System.out.println("Log de notificación por Telegram: " + mensaje);
    }

}