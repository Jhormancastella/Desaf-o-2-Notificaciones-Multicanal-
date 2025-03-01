package com.notificacionesmulticanal.factories;

import com.notificacionesmulticanal.notificacion.TelegramNotificacion;

public class TelegramNotificacionFactory implements NotificacionFactory {
    
    public TelegramNotificacion createNotificacion() {
        return new TelegramNotificacion();
    }

}
