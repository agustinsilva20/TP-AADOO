
import Clases.Alarma.Alarma;
import Clases.Animal.Animal;
import Clases.Control.Control;
import Clases.Control.TipoControl;
import Clases.Notificador.Notificador;
import Clases.Notificador.NotificadorWhatsapp;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import Clases.Usuario.Usuario;
import Controladores.*;
import org.junit.Before;
import org.junit.Test;

public class TestAlarmasProgramadas {
    static List<Usuario> veterinarios;
    static ControllerUsuario controllerUsuario;
    static ControllerAnimal controllerAnimal;
    static ControllerTratamientoMed controllerTratamientoMed;
    static ControllerAlarma controllerAlarma;
    static Animal animal;

    @Before
	public void setUp() throws Exception{
        // Una vez ingresado al sistema; se establecerán alarmas programadas por los veterinarios para el control
        //periódico del animal como para el seguimiento de su tratamiento médico en caso de corresponder
		cargarDatos();
	}

    @Test
	public void testLoginValido() throws Exception{
		System.out.println("");
		System.out.println(" ********* ");
		System.out.println("Inicio - Probar login exitoso");

        Boolean login = controllerUsuario.autenticar("agussilva20", "1234");

		assertTrue("El resultado no es el esperado", login.equals(Boolean.TRUE));
	
	}

    @Test
	public void testLoginNoValido() throws Exception{
		System.out.println("");
		System.out.println(" ********* ");
		System.out.println("Inicio - Probar login No exitoso");

        Boolean login = controllerUsuario.autenticar("Juani03", "123");

		assertTrue("El resultado no es el esperado", login.equals(Boolean.FALSE));
	
	}

    @Test
	public void CargarAlarma() throws Exception{
		System.out.println("");
		System.out.println(" ********* ");
		System.out.println("Inicio - Probar carga de alarma");
        Boolean login = controllerUsuario.autenticar("Juani03", "1234");

        List<Control> acciones = new ArrayList<Control>();
        Control accion = new Control(TipoControl.COLOCAR_VACUNA);
        acciones.add(accion);

        controllerAlarma.crearAlarma(animal,null,acciones,1);

        Alarma alarma = controllerAlarma.getAlarmas().get(0);

        alarma.setNotificador(new Notificador(new NotificadorWhatsapp()));

        Boolean notificaciones_recibidas = controllerAlarma.notificarVeterinarios(alarma, veterinarios,"Alarma activada!");

		assertTrue("El resultado no es el esperado", notificaciones_recibidas.equals(Boolean.TRUE));
	
	}

    public void cargarDatos(){
        controllerUsuario = ControllerUsuario.getInstance();
        veterinarios = controllerUsuario.getVeterinarios();

        controllerAnimal = ControllerAnimal.getInstance();
        animal = controllerAnimal.getAnimales().get(2); // Animal no sano, domestico

        controllerAlarma = ControllerAlarma.getInstance();

        controllerTratamientoMed = ControllerTratamientoMed.getInstance();
    }

}
