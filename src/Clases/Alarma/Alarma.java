package Clases.Alarma;

import java.time.LocalTime;
import java.util.*;

import Clases.Animal.Animal;
import Clases.Control.Control;
import Clases.TratamientoMedico.TratamientoMedico;
import Clases.Usuario.Usuario;

public class Alarma {

	private Integer periodicidad;
	private LocalTime ultimaEjecucion;
	private List<Control> acciones;
	public TratamientoMedico tratamientoMedico;
	public Animal animal;
	public Alarma(Animal animal, TratamientoMedico tratamientoMedico, List<Control> acciones, int periodicidad, List<Usuario> veterinarios) {
		this.animal = animal;
		this.tratamientoMedico = tratamientoMedico;
		this.acciones = acciones;
		this.ultimaEjecucion = null;
		this.periodicidad =periodicidad;

		notificarAVeterinarios(veterinarios, "Accion requerida");
	}
	public void notificarAVeterinarios(List<Usuario> veterinarios, String mensaje) {
		for (Usuario vet: veterinarios){
			vet.notificar(mensaje);
		}
	}
	public void notificar(String mensaje) {
		// TODO implement here
	}

}