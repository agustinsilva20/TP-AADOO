package Controladores;

import Clases.Alarma.Alarma;
import Clases.Animal.Animal;
import Clases.Control.Control;
import Clases.TratamientoMedico.TratamientoMed;
import Clases.Usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

public class ControllerAlarma {
    private static ControllerAlarma instance;
    private static List<Alarma> alarmas = new ArrayList<>();

    private void instanciarAlarmas() {
        //Instanciar adopciones

    }

    private ControllerAlarma(){}

    public static ControllerAlarma getInstance(){
        if (instance == null){
            instance = new ControllerAlarma();
            instance.instanciarAlarmas();
        }
        return instance;
    }

    public List<Alarma> getAlarmas(){
        return alarmas;
    }

    public void crearAlarma(Animal animal, TratamientoMed tratamientoMed, List<Control> acciones, int periodicidad){
        alarmas.add(new Alarma(animal,tratamientoMed,acciones,periodicidad));

    }

    public Boolean notificarVeterinarios(Alarma alarma, List<Usuario> veterinarios, String mensaje){
        return alarma.notificarAVeterinarios(veterinarios, mensaje);
    }

    public void atenderAlarma(Alarma alarma,Usuario veterinario){
        alarma.atenderAlarma(alarma, veterinario);
    }

}
