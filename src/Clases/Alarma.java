package Clases;

import java.time.LocalTime;
import java.util.*;

public class Alarma {

	private Integer periodicidad;
	private LocalTime ultimaEjecucion;
	private List<Control> acciones;
	public TratamientoMedico tratamientoMedico;
	public Animal animal;

	/**
	 * Default constructor
	 */
	public Alarma() {
	}

	/**
	 * @param veterinarios
	 * @return
	 */
	public void notificarAVeterinarios(List<Usuario> veterinarios) {
		// TODO implement here
	}

	/**
	 * @param mensaje
	 * @return
	 */
	public void notificar(String mensaje) {
		// TODO implement here
	}

}