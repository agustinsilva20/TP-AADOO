package Clases.Autenticador;

public interface Autentificador {

    Boolean login(String nombreUsuario, String contrasenia);


    Boolean registro(String nombreUsuario, String contrasenia);

}