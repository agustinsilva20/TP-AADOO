package Clases.Autenticador;
import java.util.*;

/**
 * 
 */
public interface Autentificador {

    Boolean login(String nombreUsuario, String contrasenia);


    Boolean registro(String nombreUsuario, String contrasenia);

}