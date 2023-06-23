package Clases.Animal;
import java.util.*;

import Clases.Exportador.*;
import Clases.Notificador;
import Clases.SeguimientoAdopcion;
import Clases.TratamientoMedico;
import Clases.Cliente.Cliente;
import Clases.FichaTecnica.FichaTecnica;
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
    }
    private TratamientoMedico tratamientoMedicoActual;
    private FichaTecnica fichaTecnica;
    private Boolean enTratamiento;
    private int id;
    private Boolean salvaje;
    private SeguimientoAdopcion seguimiento_adopcion;
    
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

}