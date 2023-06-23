package Clases.Autenticador;
import java.util.*;

/**
 * 
 */
public interface Autentificador {

    void login(String nombreUsuario, String contrasenia);


    void registro(String nombreUsuario, String contrasenia);

}