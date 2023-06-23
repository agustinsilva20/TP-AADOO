package Clases;
import java.util.*;

import Clases.Animal.Animal;
import Clases.Cliente.Cliente;
import Clases.Usuario.Usuario;


public class SeguimientoAdopcion implements Notificador {


    public SeguimientoAdopcion(Cliente cliente, Usuario seguimiento, Notificador notificador) {
        this.cliente = cliente;
        this.responsableSeguimiento = seguimiento;
        this.cadencia = new Cadencia();
        this.requiereVisita = true;
        this.notificador = notificador;



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

    public Encuesta completarEncuesta(Estado estadoAnimal, Estado estadoLimpieza, Estado estadoAmbiente) {

        Encuesta encuesta = new Encuesta(estadoAnimal,estadoLimpieza,estadoAmbiente);

        return encuesta;
    }

    public void cambiarPreferencia(Notificador notificador) {
        this.notificador = notificador;
    }

    @Override
    public String notificar(String mensaje) {
        return this.notificador.notificar(mensaje);
    }
}