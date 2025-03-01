package com.notificacionesmulticanal.notificacion;

public class WhatsAppNotificacion implements Notificacion {
    @Override
    public void enviarNotificacion(String mensaje) {
        System.out.println("Enviando notificación por WhatsApp: " + mensaje);
    }

    @Override
    public void logNotificacion(String mensaje) {
        System.out.println("Registrando notificación por WhatsApp: " + mensaje);
    }
}