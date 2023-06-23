package Clases;

import java.time.LocalTime;
import java.util.*;

import Clases.Animal.Animal;
import Clases.Control.Control;
import Clases.Usuario.Usuario;

public class Alarma {

	private Integer periodicidad;
	private LocalTime ultimaEjecucion;
	private List<Control> acciones;
	public TratamientoMedico tratamientoMedico;
	public Animal animal;
	public Alarma() {
	}
	public void notificarAVeterinarios(List<Usuario> veterinarios) {
		// TODO implement here
	}
	public void notificar(String mensaje) {
		// TODO implement here
	}

}