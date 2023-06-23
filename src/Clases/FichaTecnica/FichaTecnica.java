package Clases.FichaTecnica;
import java.util.*;

import Clases.TratamientoMedico;
import Clases.Visitas;
import Clases.Animal.Animal;
import Clases.Control.Control;
import Clases.Exportador.*;

/**
 * 
 */
public class FichaTecnica implements Exportador {

    public FichaTecnica(Animal animal, Double altura, Double peso, int edad, Boolean buenEstadoSalud, Exportador exportador, Boolean salvaje) {
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
    private Exportador estrategiaExportador;
    private Boolean salvaje;

    public void cambiarEstrategia(Exportador exportador) {
        this.estrategiaExportador = exportador;
    }


    public String exportar() {
        return this.estrategiaExportador.exportar();
    }

}