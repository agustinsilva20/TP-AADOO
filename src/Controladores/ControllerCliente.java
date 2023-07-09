package Controladores;

import Clases.Cliente.*;

import java.util.List;

public class ControllerCliente {

    private static ControllerCliente instance;
    private static List<ClienteCorreccion> clientes;

    private void instanciarClientes() {
        clientes.add(new ClienteCorreccion("Agustin", "Silva", EstadoCivil.SOLTERO, "agustinsilvab@hotmail.com", 1156223610, Ocupacion.ESTUDIANTE, TipoAnimalDomestico.GATO));
        clientes.add(new ClienteCorreccion("Juan Ignacio", "Alippi", EstadoCivil.CASADO, "juanignacioalippi@gmail.com", 1150365966, Ocupacion.ESTUDIANTE, TipoAnimalDomestico.PERRO));
    }


    private ControllerCliente(){}

    public static ControllerCliente getInstance(){
        if (instance == null){
            instance = new ControllerCliente();
            instance.instanciarClientes();
        }
        return instance;
    }

    public List<ClienteCorreccion> getClientes(){
        return clientes;
    }
}

