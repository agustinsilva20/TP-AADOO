package Clases.Usuario;

import java.util.ArrayList;
import java.util.List;

import Clases.Animal.Animal;
//import Clases.Autenticador.Autentificador;
import Clases.Autenticador.Autentificador;
import Clases.Autenticador.ModuloAutenticacionAdapter;
import Clases.Control.Control;
import Clases.Notificador.EstrategiaNotificacion;
import Clases.TratamientoMedico.TratamientoMedico;

public class Usuario implements Autentificador {

    public Usuario(String nombre, String apellido, String email, int telefono, String nombreUser, Enum<TipoUsuario> tipoUsuario, String contrasenia, EstrategiaNotificacion estrategiaNotificacion) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.telefono = telefono;
    this.nombreUsuario = nombreUser;
    this.tipoUsuario = tipoUsuario;
    this.contrasenia = contrasenia;
    this.autenticador = new ModuloAutenticacionAdapter();
    this.estrategiaNotificacion = estrategiaNotificacion;
    this.registro(nombreUsuario, contrasenia);
    this.notificaciones = new ArrayList<>();
    
    }

    private String nombre;
    private String apellido;
    private String email;
    private Integer telefono;
    private String nombreUsuario;
    private Enum<TipoUsuario> tipoUsuario;
    private String contrasenia;
    private EstrategiaNotificacion estrategiaNotificacion;
    private List<String> notificaciones;

    private Autentificador autenticador;
    public Boolean login(String nombreUsuario, String contrasenia) {
        return autenticador.login(nombreUsuario,contrasenia);
    }
    public Boolean registro(String nombreUsuario, String contrasenia) {
        return autenticador.registro(nombreUsuario,contrasenia);
    }
    
    public void agregar_alarma(Animal animal, List<Control> acciones, int periodicidad){
        animal.agregar_alarma(null, 0);
    }

    public void crear_tratamiento(Animal animal, TratamientoMedico tratamiento){
        animal.asignarTratamiento(tratamiento);
    }

    public void notificar(String mensaje){
        this.notificaciones.add(this.estrategiaNotificacion.notificar(mensaje));
    }

    public List<String> getNotificaciones(){
        return this.notificaciones;
    }

}