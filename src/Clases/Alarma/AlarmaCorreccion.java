package Clases.Alarma;

import Clases.Animal.Animal;
import Clases.Control.Control;
import Clases.Notificador.Notificador;
import Clases.TratamientoMedico.TratamientoMedico;
import Clases.Usuario.Usuario;

import java.time.LocalTime;
import java.util.List;

public class AlarmaCorreccion {

    private Integer periodicidad;
    private LocalTime ultimaEjecucion;
    private List<Control> acciones;
    private Notificador notificador;
    private TratamientoMedico tratamientoMedico;
    private Animal animal;
    private EstadoAlarma estadoAlarma;

    public AlarmaCorreccion(Animal animal, TratamientoMedico tratamientoMedico, List<Control> acciones, int periodicidad, List<Usuario> veterinarios) {
        this.animal = animal;
        this.tratamientoMedico = tratamientoMedico;
        this.acciones = acciones;
        this.ultimaEjecucion = null;
        this.periodicidad = periodicidad;
        this.estadoAlarma = new AlarmaPendiente();
        notificarAVeterinarios(veterinarios, "Accion requerida");
    }

    public void cambiarEstado(EstadoAlarma estadoAlarma){
        this.estadoAlarma = estadoAlarma;
    }
    public void notificarAVeterinarios(List<Usuario> veterinarios, String mensaje) {
        for (Usuario vet: veterinarios){
            vet.notificar(mensaje);
        }
    }

    public void setNotificador(Notificador notificador) {
        this.notificador = notificador;
    }

    public void notificar(String mensaje) {
        this.notificador.notificar(mensaje);
    }

}
