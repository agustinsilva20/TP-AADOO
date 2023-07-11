package Controladores;

import Clases.Animal.Animal;
import Clases.Control.Control;
import Clases.Encuesta.Visita;
import Clases.Exportador.IEstrategiaExportador;
import Clases.FichaTecnica.FichaTecnica;
import Clases.TratamientoMedico.TratamientoMed;

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

    public void agregarVisitaFichaTec(FichaTecnica fichaTecnica, Visita visita){
        fichaTecnica.agregarVisita(visita);
    }

    public void agregarControlFichaTec(FichaTecnica fichaTecnica, Control contol){
        fichaTecnica.agregarControl(contol);
    }

    public void agregarTratamiendoMedFichaTec(FichaTecnica fichaTecnica, TratamientoMed tratamientoMed){
        fichaTecnica.agregarTratamiento(tratamientoMed);
    }

    public List<FichaTecnica> getFichasTecnicas(){
        return fichasTecnicas;
    }
}
