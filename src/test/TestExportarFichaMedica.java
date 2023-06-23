package test;

import Clases.*;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class TestExportarFichaMedica {
	static Animal animal;
	
	@Before
	public void setUp() throws Exception{
		cargarDatosAnimal();

	}
	
	@Test
	public void ExportarPDF() throws Exception{
		System.out.println("");
		System.out.println(" ********* ");
		System.out.println("Inicio - Exportar ficha PDF");
		
		String exportado = animal.exportFicha();
		assertTrue("El resultado no es el esperado", exportado.equals("Exportando PDF..."));
	}
	
	@Test
	public void ExportarExcel() throws Exception{
		System.out.println("");
		System.out.println(" ********* ");
		System.out.println("Inicio - Exportar ficha PDF");
		animal.cambiar_exportador(new ExportarExcel());
		String exportado = animal.exportFicha();
		assertTrue("El resultado no es el esperado", exportado.equals("Exportando Excel..."));
	}
	
	public void cargarDatosAnimal() {
		
		animal = new Animal (2, 0.3, 10.0, 2, true, new ExportarPDF(),false);
		
	}
}
