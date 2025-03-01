# 🎯 Desafío 2: Notificaciones Multicanal 📩

## 📌 Descripción

Ampliar el sistema de notificaciones para soportar nuevos tipos de mensajes:

- **WhatsApp**
- **Telegram**
- **Slack**

Cada notificación debe permitir:

1. **Enviar el mensaje** (`sendMessage()`).
2. **Registrar el mensaje en un log** (`logMessage()`).

---

## 🛠️ Tareas

1. **Agrega nuevas notificaciones** usando el patrón **Abstract Factory**.
2. **Implementa una fábrica concreta** para cada servicio (WhatsApp, Telegram, Slack).
3. **Permite al código cliente** seleccionar el tipo de notificación sin conocer su implementación.

---

## 🚀 Estructura del Proyecto

### 📂 Clases Principales

1. **Interfaces:**
   - `NotificationFactory`: Define los métodos para crear notificaciones.
   - `Notification`: Define los métodos comunes para todas las notificaciones (`sendMessage()`, `logMessage()`).

2. **Fábricas Concretas:**
   - `WhatsAppNotificationFactory`: Implementa `NotificationFactory` para crear notificaciones de WhatsApp.
   - `TelegramNotificationFactory`: Implementa `NotificationFactory` para crear notificaciones de Telegram.
   - `SlackNotificationFactory`: Implementa `NotificationFactory` para crear notificaciones de Slack.

3. **Notificaciones Concretas:**
   - `WhatsAppNotification`: Implementa `Notification` para enviar y registrar mensajes en WhatsApp.
   - `TelegramNotification`: Implementa `Notification` para enviar y registrar mensajes en Telegram.
   - `SlackNotification`: Implementa `Notification` para enviar y registrar mensajes en Slack.

4. **Cliente:**
   - `Client`: Solicita un tipo de notificación y utiliza la fábrica correspondiente para obtenerla.

---

## 🚀 Instalación y Configuración

### 📋 Requisitos Previos

- **Java Development Kit (JDK) 17 o superior**
- **Git instalado en tu sistema**

### 📥 Clonar Repositorio

```bash
git clone https://github.com/Jhormancastella/Desafio-2-Notificaciones-Multicanal-.git
```

### 🛠️ Compilar y Ejecutar

1. Abre una terminal en la carpeta del proyecto.
2. Compila los archivos Java:

```bash
javac -d . *.java
```

3. Ejecuta el programa:

```bash
java Client
```

---

## 🛠️ Uso

1. **Selección de Canal:**
   - El programa solicitará al usuario seleccionar un canal de notificación (WhatsApp, Telegram, Slack).

2. **Envío del Mensaje:**
   - Una vez seleccionado el canal, se enviará el mensaje.

3. **Registro en Log:**
   - El mensaje se registrará en un log para su seguimiento.

---

## 📋 Ejemplo de Ejecución

```plaintext
Seleccione el canal de notificación (WhatsApp, Telegram, Slack): WhatsApp
Enviando mensaje por WhatsApp...
Mensaje enviado correctamente.
Registrando mensaje en el log...
Mensaje registrado: [WhatsApp] Hola, este es un mensaje de prueba.
```

---

## 📋 Características

- **Soporte para múltiples canales** (WhatsApp, Telegram, Slack).
- **Uso del patrón Abstract Factory** para garantizar flexibilidad y escalabilidad.
- **Interfaz común** para todas las notificaciones, permitiendo operaciones como enviar y registrar mensajes.

---

## 🚨 Estado del Ejercicio

- **Culminado.**

---

## 👤 Autor

- **Jhorman Jesús Castellanos Morales**
