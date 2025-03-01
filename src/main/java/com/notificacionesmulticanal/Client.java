package com.notificacionesmulticanal;

import com.notificacionesmulticanal.factories.NotificacionFactory;
import com.notificacionesmulticanal.factories.SlackNotificacionFactory;
import com.notificacionesmulticanal.factories.TelegramNotificacionFactory;
import com.notificacionesmulticanal.factories.WhatsAppNotificacionFactory;


import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Seleccione el canal de notificación (WhatsApp, Telegram, Slack): ");
        String canal = scanner.nextLine();

        NotificacionFactory factory = null;

        switch (canal.toLowerCase()) {
            case "whatsapp":
                factory = new WhatsAppNotificacionFactory();
                break;
            case "telegram":
                factory = new TelegramNotificacionFactory();
                break;
            case "slack":
                factory = new SlackNotificacionFactory();
                break;
            default:
                System.out.println("Canal no soportado.");
                return;
        }

        if (factory != null) {
            var notificacion = factory.createNotificacion();
            notificacion.enviarNotificacion("¡Hola, mundo!");
            notificacion.logNotificacion("Notificación enviada.");
        }
    }
}