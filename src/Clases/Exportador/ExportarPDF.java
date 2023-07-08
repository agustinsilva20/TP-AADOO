package Clases.Exportador;

import Clases.FichaTecnica.FichaTecnica;


public class ExportarPDF implements IEstrategiaExportador {

    AdapterExportarPDF adapter = new AdapterPDF();
    public ExportarPDF() {
    }

    public String exportar(FichaTecnica fichaTecnica) {
        String s = adapter.exportarPDF(fichaTecnica);
        return s;
    }

}