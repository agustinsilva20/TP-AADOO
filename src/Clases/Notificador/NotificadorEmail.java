package Clases.Notificador;
import java.util.*;

/**
 * 
 */
public class NotificadorEmail implements Notificador {

    /**
     * Default constructor
     */
    public NotificadorEmail() {
    }

    /**
     * @param mensaje 
     * @return
     */
    public String notificar(String mensaje) {
        return "Email enviado.";
    }

}