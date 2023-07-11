package Clases.FichaTecnica;

import Clases.Animal.Animal;
import Clases.Control.Control;
import Clases.Encuesta.Visita;
import Clases.Exportador.IEstrategiaExportador;
import Clases.TratamientoMedico.TratamientoMed;

import java.util.ArrayList;
import java.util.List;

public class FichaTecnica {
    public FichaTecnica(Animal animal, IEstrategiaExportador exportador) {
        this.animal = animal;
        this.historialControles = new ArrayList<>();
        this.historialTratamientos = new ArrayList<>();
        this.historialVisitas = new ArrayList<>();
        this.estrategiaExportador = exportador;
    }

    private Animal animal;
    private List<Control> historialControles;
    private List<TratamientoMed> historialTratamientos;
    private List<Visita> historialVisitas;
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

    public void agregarVisita(Visita visita){
        historialVisitas.add(visita);
    }

    public void removerVisita(Visita visita){
        historialVisitas.remove(visita);
    }

    public void agregarControl(Control control){
        historialControles.add(control);
    }

    public void removerControl(Control control){
        historialControles.remove(control);
    }


}
