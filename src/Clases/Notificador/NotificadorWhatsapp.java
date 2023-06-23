package Clases.Notificador;
import java.util.*;


public class NotificadorWhatsapp implements Notificador {

    public NotificadorWhatsapp() {
    }

    public String notificar(String mensaje) {
        return "WhatsApp enviado.";
    }

}