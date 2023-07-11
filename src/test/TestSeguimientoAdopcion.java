
import Clases.Animal.Animal;
import Clases.Cliente.*;
import Clases.Notificador.EstrategiaNotificacion;
import Clases.Notificador.NotificadorSMS;
import Clases.SeguimientoAdopcion.Adopcion;

import static org.junit.Assert.assertTrue;

import Clases.Usuario.Usuario;
import Controladores.ControllerAdopcion;
import Controladores.ControllerAnimal;
import Controladores.ControllerCliente;
import Controladores.ControllerUsuario;
import org.junit.Before;
import org.junit.Test;

public class TestSeguimientoAdopcion {
	static EstrategiaNotificacion estrategiaNotificacion;
	static Usuario veterinario;
	static Animal animal;
	static Cliente cliente;
	static ControllerAdopcion controllerAdopcion;
	
	@Before
	public void setUp() throws Exception{
		cargarDatos();
	}
	
	@Test
	public void Recordatorios() throws Exception{
		System.out.println("");
		System.out.println(" ********* ");
		System.out.println("Inicio - Configurar seguimiento y enviar notificacion SMS");

		estrategiaNotificacion = new NotificadorSMS();

		controllerAdopcion.crearAdopcion(veterinario,cliente,estrategiaNotificacion,animal);

		Adopcion adopcion = controllerAdopcion.getAdopciones().get(0);

		String recordatorio = adopcion.enviarRecordatorio("");
		System.out.println(recordatorio);
		assertTrue("El resultado no es el esperado", recordatorio.equals("SMS enviado."));
	}
	

	public void cargarDatos()  {
		ControllerUsuario controllerUsuario = ControllerUsuario.getInstance();
		veterinario = controllerUsuario.getVeterinarios().get(0);

		ControllerCliente controllerCliente = ControllerCliente.getInstance();
		cliente = controllerCliente.getClientes().get(0);

		ControllerAnimal controllerAnimal = ControllerAnimal.getInstance();
		animal = controllerAnimal.getAnimales().get(1); //Animal sano y domestico

		controllerAdopcion = ControllerAdopcion.getInstance();

	}
}
