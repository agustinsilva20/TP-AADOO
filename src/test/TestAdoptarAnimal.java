package test;

import Clases.Animal.Animal;
import Clases.Cliente.Cliente;
import Clases.Cliente.EstadoCivil;
import Clases.Cliente.Ocupacion;
import Clases.Cliente.TipoAnimalDomestico;
import Clases.Exportador.ExportarPDF;
import Clases.Notificador.EstrategiaNotificacion;
import Clases.Notificador.NotificadorSMS;
import Clases.Notificador.NotificadorWhatsapp;
import Clases.Usuario.TipoUsuario;
import Clases.Usuario.Usuario;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class TestAdoptarAnimal {
	static Animal animal1;
	static Animal animal2;
	static Animal animal3;
	static Animal animal4;
	static Animal animal5;
	
	static Cliente cliente;
	static Usuario usuario_seguimiento;
	static EstrategiaNotificacion estrategiaNotificacion;
	
	@Before
	public void setUp() throws Exception{
		cargarDatosAnimales();
		cargarDatosCliente();
	}
	
	@Test
	public void adoptarAnimalSano() throws Exception{
		System.out.println("");
		System.out.println(" ********* ");
		System.out.println("Inicio - Adoptar un Animal No salvaje Sano");
		cliente.agregarMascotaAdoptada(animal2, usuario_seguimiento, estrategiaNotificacion);
		int cant_mascotas = cliente.getCantidadMascotas();
		Boolean cumpleOjetivo = cant_mascotas == 1;
		assertTrue("El resultado no es el esperado", cumpleOjetivo.equals(Boolean.TRUE));
	}
	@Test
	public void adoptarAnimalSalvajeSano() throws Exception{
		System.out.println("");
		System.out.println(" ********* ");
		System.out.println("Inicio - Adoptar un Animal salvaje Sano");
		cliente.agregarMascotaAdoptada(animal1, usuario_seguimiento, estrategiaNotificacion);
		int cant_mascotas = cliente.getCantidadMascotas();
		Boolean cumpleOjetivo = cant_mascotas == 0;
		assertTrue("El resultado no es el esperado", cumpleOjetivo.equals(Boolean.TRUE));
	}
	
	@Test
	public void adoptarAnimalNoSano() throws Exception{
		System.out.println("");
		System.out.println(" ********* ");
		System.out.println("Inicio - Adoptar un Animal no Sano");
		cliente.agregarMascotaAdoptada(animal3, usuario_seguimiento, estrategiaNotificacion);
		int cant_mascotas = cliente.getCantidadMascotas();
		System.out.println(cant_mascotas);
		Boolean cumpleOjetivo = cant_mascotas == 0;
		assertTrue("El resultado no es el esperado", cumpleOjetivo.equals(Boolean.TRUE));
	}
	
	@Test
	public void adoptarMasDeDosAnimales() throws Exception{
		System.out.println("");
		System.out.println(" ********* ");
		System.out.println("Inicio - Adoptar 3 animales");
		cliente.agregarMascotaAdoptada(animal2, usuario_seguimiento, estrategiaNotificacion);
		cliente.agregarMascotaAdoptada(animal4, usuario_seguimiento, estrategiaNotificacion);
		cliente.agregarMascotaAdoptada(animal5, usuario_seguimiento, estrategiaNotificacion);
		int cant_mascotas = cliente.getCantidadMascotas();
		System.out.println(cant_mascotas);
		Boolean cumpleOjetivo = cant_mascotas == 2;
		System.out.println(cumpleOjetivo);
		assertTrue("El resultado no es el esperado", cumpleOjetivo.equals(true));
	}
	
	public void cargarDatosCliente()  {
		cliente = new Cliente("Agustin", "Silva", EstadoCivil.SOLTERO, "agustinsilvab@hotmail.com", 1156223610, Ocupacion.ESTUDIANTE, TipoAnimalDomestico.GATO, false);
		usuario_seguimiento = new Usuario("Juan", "Gomez", "juangomez@puppies.com", 1155532123, "Juan", TipoUsuario.VISITADOR, "12345678", new NotificadorWhatsapp());
		estrategiaNotificacion = new NotificadorSMS();
	}
	
	
	public void cargarDatosAnimales() {
		// Animal salvaje sano
		animal1 = new Animal (0.3, 10.0, 2, true, new ExportarPDF(),true,new ArrayList<>());
		// Animal no salvaje sano
		animal2 = new Animal (0.3, 10.0, 2, true, new ExportarPDF(),false,new ArrayList<>());
		// Animal no salvaje no sano
		animal3 = new Animal (0.3, 10.0, 2, false, new ExportarPDF(),false,new ArrayList<>());
		//animal3.setEnTratamiento(true);
		// Animal no salvaje sano
		animal4 = new Animal (0.3, 10.0, 2, true, new ExportarPDF(),false,new ArrayList<>());
		// Animal no salvaje sano
		animal5 = new Animal (0.3, 10.0, 2, true, new ExportarPDF(),false,new ArrayList<>());
		
	}
}
