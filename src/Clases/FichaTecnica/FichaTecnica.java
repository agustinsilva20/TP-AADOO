package Clases.FichaTecnica;

import Clases.Animal.Animal;
import Clases.Control.Control;
import Clases.Encuesta.Visitas;
import Clases.Exportador.IEstrategiaExportador;
import Clases.TratamientoMedico.TratamientoMed;

import java.util.ArrayList;
import java.util.List;

public class FichaTecnica {
    public FichaTecnica(Animal animal, IEstrategiaExportador exportador) {
        this.animal = animal;
        this.historialControles = new ArrayList<Control>();
        this.historialTratamientos = new ArrayList<TratamientoMed>();
        this.historialVisitas = new ArrayList<Visitas>();
        this.estrategiaExportador = exportador;
    }

    private Animal animal;
    private List<Control> historialControles;
    private List<TratamientoMed> historialTratamientos;
    private List<Visitas> historialVisitas;
    private IEstrategiaExportador estrategiaExportador;

    public void cambiarEstrategia(IEstrategiaExportador exportador) {
        this.estrategiaExportador = exportador;
    }


    public String exportar() {
        return this.estrategiaExportador.exportar(this);
    }

    public void agregarTratamiento(TratamientoMed tratamientoMed){
        historialTratamientos.add(tratamientoMed);
    }

    public void removerTratamiento(TratamientoMed tratamientoMed){
        historialTratamientos.remove(tratamientoMed);
    }

    public void agregarVisita(Visitas Visita){
        historialVisitas.add(Visita);
    }

    public void removerVisita(Visitas Visita){
        historialVisitas.remove(Visita);
    }

    public void agregarControl(Control control){
        historialControles.add(control);
    }

    public void removerControl(Control control){
        historialControles.remove(control);
    }


}
