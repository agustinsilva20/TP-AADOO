package Clases;
import java.util.*;

/**
 * 
 */
public class NotificadorWhatsapp implements Notificador {

    /**
     * Default constructor
     */
    public NotificadorWhatsapp() {
    }

    /**
     * @param mensaje 
     * @return
     */
    public String notificar(String mensaje) {
        return "WhatsApp enviado.";
    }

}