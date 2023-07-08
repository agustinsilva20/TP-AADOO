package Controladores;

import Clases.Cliente.Cliente;

import java.util.List;

public class ControllerCliente {

    private static ControllerCliente instance;
    private List<Cliente> clientes;

    private ControllerCliente(){}

    public static ControllerCliente getInstance(){
        if (instance == null){
            instance = new ControllerCliente();

        }
        return instance;
    }
}
