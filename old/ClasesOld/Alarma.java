package ClasesOld;

import java.time.LocalTime;
import java.util.*;

public class Alarma {

	private Integer periodicidad;
	private LocalTime ultimaEjecucion;
	private List<Control> acciones;
	public TratamientoMedico tratamientoMedico;
	public Animal animal;
	public Alarma(Animal animal, TratamientoMedico tratamientoMedico, List<Control> acciones, int periodicidad) {
		this.animal = animal;
		this.tratamientoMedico = tratamientoMedico;
		this.acciones = acciones;
		this.ultimaEjecucion = null;
		this.periodicidad =periodicidad;


	}
	public void notificarAVeterinarios(List<Usuario> veterinarios) {
		// TODO implement here
	}
	public void notificar(String mensaje) {
		// TODO implement here
	}

}