package test;

import Clases.*;
import Clases.Animal.Animal;
import Clases.Cliente.Cliente;
import Clases.Cliente.EstadoCivil;
import Clases.Cliente.Ocupacion;
import Clases.Cliente.TipoAnimalDomestico;
import Clases.Exportador.ExportarPDF;
import Clases.Usuario.TipoUsuario;
import Clases.Usuario.Usuario;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestSeguimientoAdopcion {
	static Animal animal2;
	static Cliente cliente;
	static Usuario usuario_seguimiento;
	static Notificador notificador;
	
	@Before
	public void setUp() throws Exception{
		cargarDatosAnimales();
		cargarDatosCliente();
	}
	
	@Test
	public void Recordatorios() throws Exception{
		System.out.println("");
		System.out.println(" ********* ");
		System.out.println("Inicio - Configurar seguimiento y enviar notificacion SMS");
		cliente.agregarMascotaAdoptada(animal2, usuario_seguimiento,notificador);
		String notificacion = animal2.send_notificacion_visita();
		assertTrue("El resultado no es el esperado", notificacion.equals("SMS enviado."));
	}
	

	public void cargarDatosCliente()  {
		cliente = new Cliente("Agustin", "Silva", EstadoCivil.SOLTERO, "agustinsilvab@hotmail.com", 1156223610, Ocupacion.ESTUDIANTE, TipoAnimalDomestico.GATO, false);
		usuario_seguimiento = new Usuario("Juan", "Gomez", "juangomez@puppies.com", 1155532123, "Juan", TipoUsuario.VISITADOR, "12345678");
		notificador = new NotificadorSMS();
	}
	
	
	public void cargarDatosAnimales() {
		
		// Animal no salvaje sano
		animal2 = new Animal (2, 0.3, 10.0, 2, true, new ExportarPDF(),false);
		
	}
}
