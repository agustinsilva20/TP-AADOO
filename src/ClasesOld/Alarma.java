package ClasesOld;

import java.time.LocalTime;
import java.util.*;

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