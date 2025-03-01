package com.notificacionesmulticanal.factories;

import com.notificacionesmulticanal.notificacion.Notificacion;
import com.notificacionesmulticanal.notificacion.SlackNotificacion;
        
public class SlackNotificacionFactory implements NotificacionFactory {

    public static SlackNotificacion createSlackNotificacion() {
        return new SlackNotificacion();
    }

    @Override
    public Notificacion createNotificacion() {
        throw new UnsupportedOperationException();
    }

}
