package test;

import Clases.*;
import Clases.Animal.Animal;
import Clases.Control.Control;
import Clases.Control.TipoControl;
import Clases.Exportador.ExportarPDF;
import Clases.Notificador.NotificadorWhatsapp;
import Clases.TratamientoMedico.TratamientoMedico;
import Clases.Usuario.TipoUsuario;
import Clases.Usuario.Usuario;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class TestAlarmasProgramadas {
    
    static Usuario user;
    static Usuario user2;
    static Animal animal;
    static TratamientoMedico tratamiento;
    static List<Usuario> veterinarios;
    @Before
	public void setUp() throws Exception{
        // Una vez ingresado al sistema; se establecerán alarmas programadas por los veterinarios para el control
        //periódico del animal como para el seguimiento de su tratamiento médico en caso de corresponder
		cargarRegistroUsuario();
        cargarAnimal();
		
	}

    @Test
	public void testLoginValido() throws Exception{
		System.out.println("");
		System.out.println(" ********* ");
		System.out.println("Inicio - Probar login exitoso");
        Boolean login = user.login("agussilva20", "12345678");
		assertTrue("El resultado no es el esperado", login.equals(Boolean.TRUE));
	
	}

    @Test
	public void testLoginNoValido() throws Exception{
		System.out.println("");
		System.out.println(" ********* ");
		System.out.println("Inicio - Probar login No exitoso");
        Boolean login = user.login("agussilva20", "123");
		assertTrue("El resultado no es el esperado", login.equals(Boolean.FALSE));
	
	}

    @Test
	public void CargarAlarma() throws Exception{
		System.out.println("");
		System.out.println(" ********* ");
		System.out.println("Inicio - Probar carga de alarma");
        Boolean login = user.login("agussilva20", "12345678");
        user.crear_tratamiento(animal, new TratamientoMedico(user, "prueba de tratamiento"));
        List<Control> acciones = new ArrayList<Control>();
        Control accion = new Control(TipoControl.COLOCAR_VACUNA);
        acciones.add(accion);
        user.agregar_alarma(animal, acciones, 1);
        // Alarma de vacunacion iniciada. Deberia notificar a ambos veterinarios
        List<String> notificacionesUser1 = user.getNotificaciones();
        List<String> notificacionesUser2 = user.getNotificaciones();

        Boolean notificaciones_recibidas = false;
        if (notificacionesUser1.get(0) == "WhatsApp enviado." && notificacionesUser2.get(0)== "WhatsApp enviado."){
            notificaciones_recibidas = true;
        }

		assertTrue("El resultado no es el esperado", notificaciones_recibidas.equals(Boolean.TRUE));
	
	}

    public void cargarRegistroUsuario(){
        user = new Usuario("Agustin", "Silva", "agustin@hotmail.com", 1156223610, "agussilva20", TipoUsuario.VETERINARIO, "12345678", new NotificadorWhatsapp());
        user2 = new Usuario("Agusstin", "Ssilva", "agustins@hotmail.com", 1156223610, "agussilva21", TipoUsuario.VETERINARIO, "12345678", new NotificadorWhatsapp());
        veterinarios = new ArrayList<Usuario>();
        veterinarios.add(user);
        veterinarios.add(user2);
    }

    public void cargarAnimal(){
       
        animal = new Animal (0.3, 10.0, 2, false, new ExportarPDF(),false,veterinarios);
    }

}
