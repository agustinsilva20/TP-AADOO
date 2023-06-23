package Clases.Notificador;

import Clases.Cliente.Cliente;

public class Notificador {
    private EstrategiaNotificacion estrategiaNotificacion;

    public Notificador( EstrategiaNotificacion estrategiaNotificacion) {

        this.estrategiaNotificacion = estrategiaNotificacion;
    }

    public String notificar(String mensaje) {
        String s = estrategiaNotificacion.notificar(mensaje);
        return s;
    }

    public void cambiarEstrategia(EstrategiaNotificacion nuevaEstrategia) {
        this.estrategiaNotificacion = nuevaEstrategia;
    }
}
