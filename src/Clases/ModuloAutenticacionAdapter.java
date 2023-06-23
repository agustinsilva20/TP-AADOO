package Clases;
import java.util.*;

/**
 * 
 */
public class ModuloAutenticacionAdapter implements Autentificador {

    private HashMap<String,String> usuarios = new HashMap<String,String>();

    /**
     * Default constructor
     */
    public ModuloAutenticacionAdapter() {}

    /**
     * @param nombreUsuario; String 
     * @param contrasenia
     */
    public void login(String nombreUsuario, String contrasenia) {
        if (usuarios.isEmpty()) {
            throw new RuntimeException("No hay usuarios cargados en el sistema.");
        }
        String contraUsuario = usuarios.get(nombreUsuario);
        if (contraUsuario == contrasenia){
            System.out.println("Logueo exitoso");
        } else {
            throw new RuntimeException("Usuario o contraseña incorrectos.");
        }
    }

    /**
     * @param nombreUsuario 
     * @param contrasenia
     */
    public void registro(String nombreUsuario, String contrasenia) {
        if (usuarios.containsKey(nombreUsuario)){
            throw new RuntimeException("Usuario ya registrado.");
        }
        usuarios.put(nombreUsuario,contrasenia);

    }

}