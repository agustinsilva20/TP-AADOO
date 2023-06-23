package Clases.Notificador;

/**
 * 
 */
public class NotificadorSMS implements EstrategiaNotificacion {

    private AdapterNotificarSMS adapter = new AdapterSMS();

    public NotificadorSMS() {
    }

  
    public String notificar(String mensaje) {
        String s = adapter.notificarSMS(mensaje);
        return s;
    }

}