package Clases.FichaTecnica;

import java.util.*;

import Clases.Encuesta.Visitas;
import Clases.Animal.Animal;
import Clases.Control.Control;
import Clases.Exportador.*;
import Clases.TratamientoMedico.TratamientoMedico;


public class FichaTecnica implements IEstrategiaExportador {

    public FichaTecnica(Animal animal, Double altura, Double peso, int edad, Boolean buenEstadoSalud, IEstrategiaExportador exportador, Boolean salvaje) {
        this.animal = animal;
        this.altura = altura;
        this.peso = peso;
        this.edad = edad;
        this.buenEstadoDeSalud = buenEstadoDeSalud;
        this.historialControles = new ArrayList<Control>();
        this.historialTratamientos = new ArrayList<TratamientoMedico>();
        this.historialVisitas = new ArrayList<Visitas>();
        this.estrategiaExportador = exportador;
        this.salvaje = salvaje;
        
    }

    private Animal animal;
    private Double altura;
    private Double peso;
    private Integer edad;
    private Boolean buenEstadoDeSalud;
    private List<Control> historialControles;
    private List<TratamientoMedico> historialTratamientos;
    private List<Visitas> historialVisitas;
    private IEstrategiaExportador estrategiaExportador;
    private Boolean salvaje;

    public void cambiarEstrategia(IEstrategiaExportador exportador) {
        this.estrategiaExportador = exportador;
    }


    public String exportar(FichaTecnica fichaTecnica) {
        return this.estrategiaExportador.exportar(fichaTecnica);
    }

}