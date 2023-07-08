package Controladores;

import Clases.Usuario.Usuario;

import java.util.List;

public class ControllerUsuario {

    private static ControllerUsuario instance;
    private List<Usuario> usuarios;

    private ControllerUsuario(){}

    public static ControllerUsuario getInstance(){
        if (instance == null){
            instance = new ControllerUsuario();
            
        }
        return instance;
    }
}
