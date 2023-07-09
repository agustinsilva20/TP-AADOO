package Controladores;

import Clases.Animal.AnimalCorreccion;
import Clases.Cliente.ClienteCorreccion;
import Clases.Notificador.EstrategiaNotificacion;
import Clases.Notificador.Notificador;
import Clases.Notificador.NotificadorSMS;
import Clases.SeguimientoAdopcion.AdopcionCorreccion;
import Clases.SeguimientoAdopcion.SeguimientoAdopcion;
import Clases.Usuario.UsuarioCorreccion;

import java.util.List;

public class ControllerAdopcion {
    private static ControllerAdopcion instance;
    private static List<AdopcionCorreccion> adopciones;

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

    public void crearAdopcion(UsuarioCorreccion usuario, ClienteCorreccion cliente, EstrategiaNotificacion estrategiaNotificacion,AnimalCorreccion mascota ){
        adopciones.add(new AdopcionCorreccion(cliente,usuario,estrategiaNotificacion,mascota));
    }
}
