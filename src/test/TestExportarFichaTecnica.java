
import Clases.Animal.Animal;
import Clases.Exportador.ExportarExcel;
import Clases.Exportador.ExportarPDF;

import static org.junit.Assert.assertTrue;

import java.util.List;

import Clases.Exportador.IEstrategiaExportador;
import Clases.FichaTecnica.FichaTecnica;
import Controladores.ControllerAnimal;
import Controladores.ControllerFichaTec;
import org.junit.Before;
import org.junit.Test;


public class TestExportarFichaTecnica {

	static List<Animal> animales;
	static ControllerFichaTec controllerFichaTec;

	static IEstrategiaExportador estrategiaExportador;
	
	@Before
	public void setUp() throws Exception{
		cargarDatosAnimal();
	}
	
	@Test
	public void ExportarPDF() throws Exception{
		System.out.println("");
		System.out.println(" ********* ");
		System.out.println("Inicio - Exportar ficha PDF");

		Animal animal = animales.get(0);

		estrategiaExportador = new ExportarPDF();

		controllerFichaTec.crearFichaTec(animal,estrategiaExportador);

		List<FichaTecnica> fichasTecnicas = controllerFichaTec.getFichasTecnicas();

		FichaTecnica fichaTecnica = fichasTecnicas.get(1); //Ficha tecnica con modelo de exportacion PDF

		String exportado = fichaTecnica.exportar();

		System.out.println(exportado);
		assertTrue("El resultado no es el esperado", exportado.equals("Exportando PDF..."));
	}
	
	@Test
	public void ExportarExcel() throws Exception{
		System.out.println("");
		System.out.println(" ********* ");
		System.out.println("Inicio - Exportar ficha Excel");
		Animal animal = animales.get(0);

		estrategiaExportador = new ExportarExcel();

		controllerFichaTec.crearFichaTec(animal,estrategiaExportador);

		List<FichaTecnica> fichasTecnicas = controllerFichaTec.getFichasTecnicas();

		FichaTecnica fichaTecnica = fichasTecnicas.get(0); //Ficha tecnica con modelo de exportacion Excel

		String exportado = fichaTecnica.exportar();

		System.out.println(exportado);
		assertTrue("El resultado no es el esperado", exportado.equals("Exportando Excel..."));
	}
	
	public void cargarDatosAnimal() {

		ControllerAnimal controllerAnimal = ControllerAnimal.getInstance();
		animales = controllerAnimal.getAnimales();

		controllerFichaTec = ControllerFichaTec.getInstance();
	}
}
