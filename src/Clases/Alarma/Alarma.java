package Clases.Alarma;

import java.time.LocalTime;
import java.util.*;

import Clases.Animal.Animal;
import Clases.Control.Control;
import Clases.Notificador.Notificador;
import Clases.TratamientoMedico.TratamientoMedico;
import Clases.Usuario.Usuario;

public class Alarma {

	private Integer periodicidad;
	private LocalTime ultimaEjecucion;
	private List<Control> acciones;
	private Notificador notificador;
	private TratamientoMedico tratamientoMedico;
	private Animal animal;


	public Alarma(Animal animal, TratamientoMedico tratamientoMedico, List<Control> acciones, int periodicidad, List<Usuario> veterinarios) {
		this.animal = animal;
		this.tratamientoMedico = tratamientoMedico;
		this.acciones = acciones;
		this.ultimaEjecucion = null;
		this.periodicidad = periodicidad;

		notificarAVeterinarios(veterinarios, "Accion requerida");
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