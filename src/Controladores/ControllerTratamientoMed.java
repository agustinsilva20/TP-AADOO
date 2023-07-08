package Controladores;

import Clases.TratamientoMedico.TratamientoMedico;

import java.util.List;

public class ControllerTratamientoMed {
    private static ControllerTratamientoMed instance;
    private static List<TratamientoMedico> TratamientosMedicos;

    private List<TratamientoMedico> instanciarTratamientosMed() {
        //Instanciar adopciones
        return null;
    }

    private ControllerTratamientoMed(){}

    public static ControllerTratamientoMed getInstance(){
        if (instance == null){
            instance = new ControllerTratamientoMed();

        }
        return instance;
    }
}
