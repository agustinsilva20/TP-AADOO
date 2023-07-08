package Clases.Autenticador;

import Clases.Autenticador.Autentificador;

import java.util.*;

/**
 * 
 */
public class ModuloAutenticacionAdapter implements Autentificador {

    private HashMap<String,String> usuarios = new HashMap<String,String>();

    public ModuloAutenticacionAdapter() {}

    public Boolean login(String nombreUsuario, String contrasenia) {
        if (usuarios.isEmpty()) {
            System.err.println("No hay usuarios cargados en el sistema.");
            return false;
        }
        String contraUsuario = usuarios.get(nombreUsuario);
        if (contraUsuario == contrasenia){
            System.out.println("Logueo exitoso");
            return true;
        } else {
            System.err.println("Usuario o contraseña incorrectos.");
            return false;
        }
    }

    public Boolean registro(String nombreUsuario, String contrasenia) {
        if (usuarios.containsKey(nombreUsuario)){
            System.err.println("Usuario ya registrado.");
            return false;
        }
        usuarios.put(nombreUsuario,contrasenia);
        System.out.println("Registro exitoso");
        return true;

    }

}