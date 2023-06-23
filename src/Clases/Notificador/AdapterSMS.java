package Clases.Notificador;

public class AdapterSMS implements AdapterNotificarSMS{

    public String notificarSMS(String mensaje) {
        //Enviar SMS.
        return "SMS enviado.";
    }
}
