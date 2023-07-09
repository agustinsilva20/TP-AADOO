package Clases.SeguimientoAdopcion;

import Clases.Animal.Animal;
import Clases.Animal.AnimalCorreccion;
import Clases.Cadencia.Cadencia;
import Clases.Cliente.ClienteCorreccion;
import Clases.Notificador.EstrategiaNotificacion;
import Clases.Notificador.Notificador;
import Clases.Usuario.UsuarioCorreccion;

public class AdopcionCorreccion {

    public AdopcionCorreccion(ClienteCorreccion cliente, UsuarioCorreccion seguimiento, EstrategiaNotificacion estrategiaNotificacion, AnimalCorreccion mascota) {
        this.cliente = cliente;
        this.responsableSeguimiento = seguimiento;
        this.cadencia = new Cadencia();
        this.requiereVisita = true;
        this.mascotaAdoptada = mascota;
        this.notificador = new Notificador(estrategiaNotificacion);
    }

    private ClienteCorreccion cliente;
    private UsuarioCorreccion responsableSeguimiento;
    private Cadencia cadencia;
    private Boolean requiereVisita;
    private AnimalCorreccion mascotaAdoptada;
    private Notificador notificador;


    public ClienteCorreccion getCliente(){
        return cliente;
    }
    public UsuarioCorreccion getResponsableSeguimiento(){
        return responsableSeguimiento;
    }
    public AnimalCorreccion getMascotaAdoptada(){
        return this.mascotaAdoptada;
    }
    public Boolean requiereVisita(){
        return requiereVisita;
    }
    public void finalizarSeguimiento() {
        this.requiereVisita = false;
    }

    public void cambiarPreferencia(EstrategiaNotificacion estrategiaNotificacion) {
        this.notificador.cambiarEstrategia(estrategiaNotificacion);
    }

    public String enviarRecordatorio(String mensaje) {
        return this.notificador.notificar(mensaje);
    }
}
