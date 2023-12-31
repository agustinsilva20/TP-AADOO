package Clases.SeguimientoAdopcion;

import Clases.Animal.Animal;
import Clases.Cadencia.Cadencia;
import Clases.Cliente.Cliente;
import Clases.Notificador.EstrategiaNotificacion;
import Clases.Notificador.Notificador;
import Clases.Usuario.Usuario;

public class Adopcion {

    public Adopcion(Cliente cliente, Usuario seguimiento, EstrategiaNotificacion estrategiaNotificacion, Animal mascota) {
        this.cliente = cliente;
        this.responsableSeguimiento = seguimiento;
        this.cadencia = new Cadencia();
        this.requiereVisita = true;
        this.mascotaAdoptada = mascota;
        this.notificador = new Notificador(estrategiaNotificacion);
    }

    private Cliente cliente;
    private Usuario responsableSeguimiento;
    private Cadencia cadencia;
    private Boolean requiereVisita;
    private Animal mascotaAdoptada;
    private Notificador notificador;


    public Cliente getCliente(){
        return cliente;
    }
    public Usuario getResponsableSeguimiento(){
        return responsableSeguimiento;
    }
    public Animal getMascotaAdoptada(){
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
