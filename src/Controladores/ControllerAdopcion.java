package Controladores;

import Clases.Animal.Animal;
import Clases.Cliente.Cliente;
import Clases.Notificador.EstrategiaNotificacion;
import Clases.SeguimientoAdopcion.Adopcion;
import Clases.Usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

public class ControllerAdopcion {
    private static ControllerAdopcion instance;
    private static List<Adopcion> adopciones = new ArrayList<>();

    private void instanciarAdopciones() {
        //Instanciar adopciones
    }

    private ControllerAdopcion(){}

    public static ControllerAdopcion getInstance(){
        if (instance == null){
            instance = new ControllerAdopcion();
            instance.instanciarAdopciones();
        }
        return instance;
    }

    public List<Adopcion> getAdopciones(){
        return adopciones;
    }

    public void crearAdopcion(Usuario usuario, Cliente cliente, EstrategiaNotificacion estrategiaNotificacion, Animal mascota ){
        adopciones.add(new Adopcion(cliente,usuario,estrategiaNotificacion,mascota));
        cliente.agregarMascotaAdoptada(mascota,usuario,estrategiaNotificacion);
    }
}
