package Controladores;

import Clases.Alarma.Alarma;

import java.util.List;

public class ControllerAlarma {
    private static ControllerAlarma instance;
    private List<Alarma> alarmas;

    private ControllerAlarma(){}

    public static ControllerAlarma getInstance(){
        if (instance == null){
            instance = new ControllerAlarma();

        }
        return instance;
    }
}
