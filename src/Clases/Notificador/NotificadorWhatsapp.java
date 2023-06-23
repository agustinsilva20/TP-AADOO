package Clases.Notificador;


public class NotificadorWhatsapp implements EstrategiaNotificacion {

    private AdapterNotificarWPP adapter = new AdapterWpp();

    public NotificadorWhatsapp() {
    }

    public String notificar(String mensaje) {
        String s = adapter.notificarWpp(mensaje);
        return s;
    }

}