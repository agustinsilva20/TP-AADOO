package Controladores;

import Clases.Animal.Animal;
import Clases.Exportador.IEstrategiaExportador;
import Clases.FichaTecnica.FichaTecnica;

import java.util.ArrayList;
import java.util.List;

public class ControllerFichaTec {

    private static ControllerFichaTec instance;
    private static List<FichaTecnica> fichasTecnicas = new ArrayList<>();

    private void instanciarFichasTec() {
        //Instanciar adopciones
    }

    private ControllerFichaTec(){}

    public static ControllerFichaTec getInstance(){
        if (instance == null){
            instance = new ControllerFichaTec();
            instance.instanciarFichasTec();
        }
        return instance;
    }

    public void crearFichaTec(Animal animal, IEstrategiaExportador exportador){
        fichasTecnicas.add(new FichaTecnica(animal,exportador));
    }

    public List<FichaTecnica> getFichasTecnicas(){
        return fichasTecnicas;
    }
}
