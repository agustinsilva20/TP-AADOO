package Controladores;

import Clases.SeguimientoAdopcion.SeguimientoAdopcion;

import java.util.List;

public class ControllerAdopcion {
    private static ControllerAdopcion instance;
    private static List<SeguimientoAdopcion> adopciones;

    private List<SeguimientoAdopcion> instanciarAdopciones() {
        //Instanciar adopciones
        return null;
    }

    private ControllerAdopcion(){
        adopciones = instanciarAdopciones();
    }

    public static ControllerAdopcion getInstance(){
        if (instance == null){
            instance = new ControllerAdopcion();
        }
        return instance;
    }
}
