package Clases;
import java.util.*;

import Clases.Notificador.Notificador;

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