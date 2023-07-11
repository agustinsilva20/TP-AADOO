package Controladores;

import Clases.Cliente.*;

import java.util.ArrayList;
import java.util.List;

public class ControllerCliente {

    private static ControllerCliente instance;
    private static List<Cliente> clientes = new ArrayList<>();

    private void instanciarClientes() {
        clientes.add(new Cliente("Agustin", "Silva", EstadoCivil.SOLTERO, "agustinsilvab@hotmail.com", 1156223610, Ocupacion.ESTUDIANTE, TipoAnimalDomestico.GATO));
        clientes.add(new Cliente("Juan Ignacio", "Alippi", EstadoCivil.CASADO, "juanignacioalippi@gmail.com", 1150365966, Ocupacion.ESTUDIANTE, TipoAnimalDomestico.PERRO));
        clientes.add(new Cliente("Morena Sol", "Cruz", EstadoCivil.CASADO, "moresol@gmail.com", 1150365967, Ocupacion.EMPLEADO, TipoAnimalDomestico.ROEDOR));
    }


    private ControllerCliente(){}

    public static ControllerCliente getInstance(){
        if (instance == null){
            instance = new ControllerCliente();
            instance.instanciarClientes();
        }
        return instance;
    }

    public List<Cliente> getClientes(){
        return clientes;
    }
}

