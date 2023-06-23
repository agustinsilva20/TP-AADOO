package test;

import Clases.*;
import Clases.Animal.Animal;
import Clases.Exportador.ExportarPDF;
import Clases.Usuario.TipoUsuario;
import Clases.Usuario.Usuario;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class TestAlarmasProgramadas {
    
    static Usuario user;
    static Animal animal;
    @Before
	public void setUp() throws Exception{
        // Una vez ingresado al sistema; se establecerán alarmas programadas por los veterinarios para el control
        //periódico del animal como para el seguimiento de su tratamiento médico en caso de corresponder
		cargarRegistroUsuario();
		
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
		System.out.println("Inicio - Probar login exitoso");
        Boolean login = user.login("agussilva20", "123");
		assertTrue("El resultado no es el esperado", login.equals(Boolean.FALSE));
	
	}

    public void cargarRegistroUsuario(){
        user = new Usuario("Agustin", "Silva", "agustin@hotmail.com", 1156223610, "agussilva20", TipoUsuario.VETERINARIO, "12345678");

    }

    public void cargarAnimal(){
        animal = new Animal (3, 0.3, 10.0, 2, false, new ExportarPDF(),false);
    }

}
