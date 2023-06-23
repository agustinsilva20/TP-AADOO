package Clases.Notificador;
import java.util.*;

public class NotificadorEmail implements Notificador {


    public NotificadorEmail() {
    }

    public String notificar(String mensaje) {
        return "Email enviado.";
    }

}