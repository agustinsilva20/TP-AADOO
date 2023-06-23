package Clases.Exportador;
import Clases.FichaTecnica.FichaTecnica;

import java.util.*;


/**
 * 
 */
public class ExportarPDF implements IEstrategiaExportador {

    AdapterExportarPDF adapter = new AdapterPDF();
    /**
     * Default constructor
     */
    public ExportarPDF() {
    }

    /**
     * @return
     */
    public String exportar(FichaTecnica fichaTecnica) {
        String s = adapter.exportarPDF(fichaTecnica);
        return s;
    }

}