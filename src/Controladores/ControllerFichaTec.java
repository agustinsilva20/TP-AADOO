package Controladores;

import Clases.FichaTecnica.FichaTec;

import java.util.List;

public class ControllerFichaTec {

    private static ControllerFichaTec instance;
    private static List<FichaTec> FichasTecnicas;

    private void instanciarFichasTec() {
        //Instanciar adopciones
    }

    private ControllerFichaTec(){}

    public static ControllerFichaTec getInstance(){
        if (instance == null){
            instance = new ControllerFichaTec();

        }
        return instance;
    }

    public void crearFichaTec(){}
}
