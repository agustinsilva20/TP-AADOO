package Clases.Usuario;

import Clases.Autenticador.Autentificador;
import Clases.Autenticador.ModuloAutenticacionAdapter;

public class Usuario implements Autentificador {

    public Usuario(String nombre, String apellido, String email, int telefono, String nombreUser, Enum<TipoUsuario> tipoUsuario, String contrasenia) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    this.telefono = telefono;
    this.nombreUsuario = nombreUser;
    this.tipoUsuario = tipoUsuario;
    this.contrasenia = contrasenia;
    this.autenticador = new ModuloAutenticacionAdapter();

    this.registro(nombreUsuario, contrasenia);
    
    }

    private String nombre;
    private String apellido;
    private String email;
    private Integer telefono;
    private String nombreUsuario;
    private Enum<TipoUsuario> tipoUsuario;
    private String contrasenia;

    private Autentificador autenticador;
    public Boolean login(String nombreUsuario, String contrasenia) {
        return autenticador.login(nombreUsuario,contrasenia);
    }
    public Boolean registro(String nombreUsuario, String contrasenia) {
        return autenticador.registro(nombreUsuario,contrasenia);
    }
    

}