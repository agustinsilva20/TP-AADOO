package Controladores;

import Clases.TratamientoMedico.TratamientoMed;
import Clases.Usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

public class ControllerTratamientoMed {
    private static ControllerTratamientoMed instance;
    private static List<TratamientoMed> tratamientosMed = new ArrayList<>();

    private void instanciarTratamientosMed() {
        //Instanciar adopciones
    }

    private ControllerTratamientoMed(){}

    public static ControllerTratamientoMed getInstance(){
        if (instance == null){
            instance = new ControllerTratamientoMed();
            instance.instanciarTratamientosMed();
        }
        return instance;
    }
    public void crearTratamientoMed(Usuario veterinario, String descripcion){
        tratamientosMed.add(new TratamientoMed(veterinario,descripcion));
    }
}
