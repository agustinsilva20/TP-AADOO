package Clases.Animal;
import java.util.*;

import Clases.Exportador.*;
import Clases.Alarma.Alarma;
import Clases.Cliente.Cliente;
import Clases.Control.Control;
import Clases.FichaTecnica.FichaTecnica;
import Clases.Notificador.Notificador;
import Clases.SeguimientoAdopcion.SeguimientoAdopcion;
import Clases.TratamientoMedico.TratamientoMedico;
import Clases.Usuario.Usuario;

/**
 * 
 */
public class Animal {


    public Animal(int id,Double altura, Double peso, int edad, Boolean buenEstadoDeSalud, Exportador exportador, Boolean salvaje ) {
        this.fichaTecnica = new FichaTecnica(this, altura, peso, edad, buenEstadoDeSalud, exportador, salvaje);
        this.enTratamiento = false;
        this.tratamientoMedicoActual = null; //averiguar
        this.id=id;
        this.salvaje = salvaje;
        this.seguimiento_adopcion= null;
        this.alarmas = new ArrayList<Alarma>();
    }
    private TratamientoMedico tratamientoMedicoActual;
    private FichaTecnica fichaTecnica;
    private Boolean enTratamiento;
    private int id;
    private Boolean salvaje;
    private SeguimientoAdopcion seguimiento_adopcion;
    private List<Alarma> alarmas;
    
    public void asignarTratamiento(TratamientoMedico tratamiento){
        this.tratamientoMedicoActual = tratamiento;
        this.enTratamiento = true;
    }
    public void removerTratamiento(){
        this.tratamientoMedicoActual = null;
        this.enTratamiento = false;
    }

    public void setEnTratamiento(Boolean estado){
        this.enTratamiento = estado;
    }
    
    public void setSeguimiento(Cliente cliente, Usuario seguimiento, Notificador notificador) {
    	this.seguimiento_adopcion = new SeguimientoAdopcion(cliente, seguimiento, notificador);
    }

    public Boolean enTratamiento() {
        
        return this.enTratamiento;
    }
    
    public Boolean getSalvaje() {
    	return this.salvaje;
    }
    
    public String send_notificacion_visita() {
    	return seguimiento_adopcion.notificar("Se aproxima una visita veterinaria");
    }
    
    public String exportFicha() {
    	return this.fichaTecnica.exportar();
    }
    
    public void cambiar_exportador(Exportador exportador) {
    	this.fichaTecnica.cambiarEstrategia(exportador);
    }

    public void agregar_alarma(TratamientoMedico tratamientoMedico, List<Control> acciones, int periodicidad){
        Alarma alarma = new Alarma(this, tratamientoMedico, acciones, periodicidad);
        alarmas.add(alarma);
    }

}