package Controladores;

import Clases.Alarma.Alarma;

import java.util.List;

public class ControllerAlarma {
    private static ControllerAlarma instance;
    private static List<Alarma> alarmas;

    private List<Alarma> instanciarAlarmas() {
        //Instanciar adopciones
        return null;
    }

    private ControllerAlarma(){}

    public static ControllerAlarma getInstance(){
        if (instance == null){
            instance = new ControllerAlarma();

        }
        return instance;
    }
}
