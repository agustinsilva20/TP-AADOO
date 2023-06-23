package Clases.Animal;
import java.util.*;

import Clases.Exportador.*;
import Clases.Alarma.Alarma;
import Clases.Cliente.Cliente;
import Clases.Control.Control;
import Clases.FichaTecnica.FichaTecnica;
import Clases.Notificador.EstrategiaNotificacion;
import Clases.SeguimientoAdopcion.SeguimientoAdopcion;
import Clases.TratamientoMedico.TratamientoMedico;
import Clases.Usuario.Usuario;

/**
 * 
 */
public class Animal {


    public Animal(Double altura, Double peso, int edad, Boolean buenEstadoDeSalud, IEstrategiaExportador exportador, Boolean salvaje, List<Usuario> veterinarios ) {
        this.fichaTecnica = new FichaTecnica(this, altura, peso, edad, buenEstadoDeSalud, exportador, salvaje);
        this.enTratamiento = false;
        this.tratamientoMedicoActual = null;
        this.salvaje = salvaje;
        this.seguimiento_adopcion= null;
        this.alarmas = new ArrayList<Alarma>();
        this.veterinarios = veterinarios;
    }
    private TratamientoMedico tratamientoMedicoActual;
    private FichaTecnica fichaTecnica;
    private Boolean enTratamiento;
    private Boolean salvaje;
    private SeguimientoAdopcion seguimiento_adopcion;
    private List<Alarma> alarmas;
    private List<Usuario> veterinarios;
    
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
    
    public void setSeguimiento(Cliente cliente, Usuario seguimiento, EstrategiaNotificacion estrategiaNotificacion) {
    	this.seguimiento_adopcion = new SeguimientoAdopcion(cliente, seguimiento, estrategiaNotificacion);
    }

    public Boolean enTratamiento() {
        
        return this.enTratamiento;
    }
    
    public Boolean getSalvaje() {
    	return this.salvaje;
    }
    
    public String send_notificacion_visita() {
    	return seguimiento_adopcion.enviarRecordatorio("Se aproxima una visita veterinaria");
    }
    
    public String exportFicha() {
    	return this.fichaTecnica.exportar(this.fichaTecnica);
    }
    
    public void cambiar_exportador(IEstrategiaExportador exportador) {
    	this.fichaTecnica.cambiarEstrategia(exportador);
    }

    public void agregar_alarma(List<Control> acciones, int periodicidad){
        Alarma alarma = new Alarma(this, tratamientoMedicoActual, acciones, periodicidad, veterinarios);
        alarmas.add(alarma);
    }

}