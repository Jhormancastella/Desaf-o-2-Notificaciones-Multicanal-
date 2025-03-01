package com.notificacionesmulticanal.factories;

import com.notificacionesmulticanal.notificacion.Notificacion;
import com.notificacionesmulticanal.notificacion.WhatsAppNotificacion;

public class WhatsAppNotificacionFactory implements NotificacionFactory {
    @Override
    public Notificacion createNotificacion() {
        return new WhatsAppNotificacion();
    }
}