package Clases.Exportador;

import Clases.FichaTecnica.FichaTecnica;


/**
 * 
 */
public class ExportarExcel implements IEstrategiaExportador {
    AdapterExportarExcel adapter = new AdapterExcel();

    /**
     * Default constructor
     */
    public ExportarExcel() {
    }

    /**
     * @return
     */
    public String exportar(FichaTecnica fichaTecnica) {
        String s = adapter.exportarExcel(fichaTecnica);
        return s;
    }

}