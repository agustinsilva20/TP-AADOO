package Controladores;

import Clases.Cliente.Cliente;

import java.util.List;

public class ControllerCliente {

    private static ControllerCliente instance;
    private static List<Cliente> clientes;

    private List<Cliente> instanciarClientes() {
        //Instanciar adopciones
        return null;
    }


    private ControllerCliente(){}

    public static ControllerCliente getInstance(){
        if (instance == null){
            instance = new ControllerCliente();

        }
        return instance;
    }
}
