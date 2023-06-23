package Clases.Notificador;

public class NotificadorEmail implements EstrategiaNotificacion {

    private AdapterNotificarEmail adapter = new AdapterEmail();

    public NotificadorEmail() {
    }

    public String notificar(String mensaje) {
        String s = adapter.notificarEmail(mensaje);
        return s;
    }

}