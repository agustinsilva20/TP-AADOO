package Controladores;

import Clases.FichaTecnica.FichaTecnica;

import java.util.List;

public class ControllerFichaTec {

    private static ControllerFichaTec instance;
    private static List<FichaTecnica> FichasTecnicas;

    private List<FichaTecnica> instanciarFichasTec() {
        //Instanciar adopciones
        return null;
    }

    private ControllerFichaTec(){}

    public static ControllerFichaTec getInstance(){
        if (instance == null){
            instance = new ControllerFichaTec();

        }
        return instance;
    }
}
