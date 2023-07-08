package Controladores;

import Clases.FichaTecnica.FichaTecnica;

import java.util.List;

public class ControllerFichaTec {

    private static ControllerFichaTec instance;
    private List<FichaTecnica> FichasTecnicas;

    private ControllerFichaTec(){}

    public static ControllerFichaTec getInstance(){
        if (instance == null){
            instance = new ControllerFichaTec();

        }
        return instance;
    }
}
