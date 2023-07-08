package Controladores;

import Clases.Usuario.Usuario;

import java.util.List;

public class ControllerUsuario {

    private static ControllerUsuario instance;
    private static List<Usuario> usuarios;

    private List<Usuario> instanciarUsuarios() {
        //Instanciar adopciones
        return null;
    }

    private ControllerUsuario(){}

    public static ControllerUsuario getInstance(){
        if (instance == null){
            instance = new ControllerUsuario();

        }
        return instance;
    }
}
