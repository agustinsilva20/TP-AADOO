package Clases.Notificador;

public class AdapterWpp implements AdapterNotificarWPP{

    public String notificarWpp(String mensaje) {
        //Enviar WhatsApp.
        return "WhatsApp enviado.";
    }
}
