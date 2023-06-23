package ClasesOld;
import java.util.*;

/**
 * 
 */
public class NotificadorSMS implements Notificador {


    public NotificadorSMS() {
    }

  
    public String notificar(String mensaje) {
        return "SMS enviado.";
    }

}