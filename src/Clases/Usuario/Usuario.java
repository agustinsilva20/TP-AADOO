package Clases.Usuario;

import Clases.Autentificador;
import Clases.ModuloAutenticacionAdapter;

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

    public void login(String nombreUsuario, String contrasenia) {
        autenticador.login(nombreUsuario,contrasenia);
    }
    public void registro(String nombreUsuario, String contrasenia) {
        autenticador.registro(nombreUsuario,contrasenia);
    }
    

}