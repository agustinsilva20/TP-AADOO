package Clases.Alarma;

import Clases.Animal.Animal;
import Clases.Control.Control;
import Clases.Notificador.Notificador;
import Clases.TratamientoMedico.TratamientoMed;
import Clases.Usuario.Usuario;

import java.time.LocalTime;
import java.util.List;

public class Alarma {

    private Animal animal;
    private Integer periodicidad;
    private LocalTime ultimaEjecucion;
    private List<Control> acciones;
    private Notificador notificador;
    private TratamientoMed tratamientoMedico;
    private EstadoAlarma estadoAlarma;

    public Alarma(Animal animal, TratamientoMed tratamientoMedico, List<Control> acciones, int periodicidad) {
        this.animal = animal;
        this.tratamientoMedico = tratamientoMedico;
        this.acciones = acciones;
        this.ultimaEjecucion = null;
        this.periodicidad = periodicidad;
        this.estadoAlarma = new AlarmaPendiente();
    }

    public void cambiarEstado(EstadoAlarma estadoAlarma){
        this.estadoAlarma = estadoAlarma;
    }
    public Boolean notificarAVeterinarios(List<Usuario> veterinarios, String mensaje) {
        for (Usuario vet: veterinarios){

            notificador.notificar(mensaje);
        }
        Boolean notificacionesEnviadas = true;
        return notificacionesEnviadas;
    }

    public void setNotificador(Notificador notificador) {
        this.notificador = notificador;
    }

    public void notificar(String mensaje) {
        this.notificador.notificar(mensaje);
    }


    public void atenderAlarma(Alarma alarma, Usuario veterinario){
        alarma.estadoAlarma.atenderAlarma(veterinario,alarma);
    }
}
