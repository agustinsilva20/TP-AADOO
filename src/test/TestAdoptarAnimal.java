
import Clases.Animal.Animal;
import Clases.Cliente.*;
import Clases.Notificador.EstrategiaNotificacion;
import Clases.Notificador.NotificadorEmail;
import Clases.Notificador.NotificadorSMS;
import Clases.Notificador.NotificadorWhatsapp;

import static org.junit.Assert.assertTrue;
import java.util.List;

import Clases.Usuario.Usuario;
import Controladores.ControllerAdopcion;
import Controladores.ControllerAnimal;
import Controladores.ControllerCliente;
import Controladores.ControllerUsuario;
import org.junit.Before;
import org.junit.Test;


public class TestAdoptarAnimal {
	static List<Animal> animales;

	static List<Cliente> clientes;

	static List<Usuario> usuarios;

	static ControllerAdopcion controllerAdopcion;
	static EstrategiaNotificacion estrategiaNotificacion;
	
	@Before
	public void setUp() throws Exception{
		cargarDatos();
	}
	
	@Test
	public void adoptarAnimalSano() throws Exception{
		System.out.println("");
		System.out.println(" ********* ");
		System.out.println("Inicio - Adoptar un Animal No salvaje Sano");
		//cliente.agregarMascotaAdoptada(animal2, usuario_seguimiento, estrategiaNotificacion);

		Cliente cliente = clientes.get(0); // Cliente X
		Usuario usuario = usuarios.get(0); // Usuario X
		Animal animal = animales.get(1); //Animal sano y domestico

		estrategiaNotificacion = new NotificadorEmail();

		controllerAdopcion.crearAdopcion(usuario,cliente,estrategiaNotificacion,animal);

		int cant_mascotas = cliente.getCantidadMascotas();
		System.out.println(cant_mascotas);

		Boolean cumpleOjetivo = cant_mascotas == 1; //Al ser una mascota sana y domestica, puede ser adoptada.
		assertTrue("El resultado no es el esperado", cumpleOjetivo.equals(Boolean.TRUE));
	}
	@Test
	public void adoptarAnimalSalvajeSano() throws Exception{
		System.out.println("");
		System.out.println(" ********* ");
		System.out.println("Inicio - Adoptar un Animal salvaje Sano");

		Cliente cliente = clientes.get(1); // Cliente X
		Usuario usuario = usuarios.get(1); // Usuario X
		Animal animal = animales.get(0); //Animal sano y salvaje

		estrategiaNotificacion = new NotificadorSMS();

		controllerAdopcion.crearAdopcion(usuario,cliente,estrategiaNotificacion,animal);

		int cant_mascotas = cliente.getCantidadMascotas();
		Boolean cumpleOjetivo = cant_mascotas == 0; //Al ser un animal salvaje, la cantidad de mascotas del cliente no aumenta.
		assertTrue("El resultado no es el esperado", cumpleOjetivo.equals(Boolean.TRUE));
	}
	
	@Test
	public void adoptarAnimalNoSano() throws Exception{
		System.out.println("");
		System.out.println(" ********* ");
		System.out.println("Inicio - Adoptar un Animal no Sano");

		Cliente cliente = clientes.get(1); // Cliente X
		Usuario usuario = usuarios.get(2); // Usuario X
		Animal animal = animales.get(2); //Animal no sano y domestico

		estrategiaNotificacion = new NotificadorWhatsapp();

		controllerAdopcion.crearAdopcion(usuario,cliente,estrategiaNotificacion,animal);

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

		Cliente cliente = clientes.get(2); // Cliente X
		Usuario usuario = usuarios.get(0); // Usuario X
		Animal animal1 = animales.get(1); //Animal sano y domestico
		Animal animal2 = animales.get(3); //Animal sano y domestico
		Animal animal3 = animales.get(4); //Animal sano y domestico

		estrategiaNotificacion = new NotificadorWhatsapp();

		controllerAdopcion.crearAdopcion(usuario,cliente,estrategiaNotificacion,animal1);
		controllerAdopcion.crearAdopcion(usuario,cliente,estrategiaNotificacion,animal2);
		controllerAdopcion.crearAdopcion(usuario,cliente,estrategiaNotificacion,animal3);

		int cant_mascotas = cliente.getCantidadMascotas();
		System.out.println(cant_mascotas);
		Boolean cumpleOjetivo = cant_mascotas == 2;
		System.out.println(cumpleOjetivo);
		assertTrue("El resultado no es el esperado", cumpleOjetivo.equals(true));
	}
	
	public void cargarDatos()  {
		ControllerCliente controllerCliente = ControllerCliente.getInstance();
		clientes = controllerCliente.getClientes();

		ControllerUsuario controllerUsuario = ControllerUsuario.getInstance();
		usuarios = controllerUsuario.getUsuarios();

		ControllerAnimal controllerAnimal = ControllerAnimal.getInstance();
		animales = controllerAnimal.getAnimales();

		controllerAdopcion = ControllerAdopcion.getInstance();
	}
	

}
