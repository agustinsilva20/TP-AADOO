package Controladores;

import Clases.TratamientoMedico.TratamientoMedico;

import java.util.List;

public class ControllerTratamientoMed {
    private static ControllerTratamientoMed instance;
    private List<TratamientoMedico> TratamientosMedicos;

    private ControllerTratamientoMed(){}

    public static ControllerTratamientoMed getInstance(){
        if (instance == null){
            instance = new ControllerTratamientoMed();

        }
        return instance;
    }
}
