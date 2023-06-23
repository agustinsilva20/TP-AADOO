package Clases.Notificador;

public class AdapterEmail implements AdapterNotificarEmail{
    @Override
    public String notificarEmail(String mensaje) {
        //Enviar email.
        return "Email enviado.";
    }
}
