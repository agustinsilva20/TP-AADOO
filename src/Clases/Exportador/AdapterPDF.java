package Clases.Exportador;

import Clases.FichaTecnica.FichaTecnica;

public class AdapterPDF implements AdapterExportarPDF{
    @Override
    public String exportarPDF(FichaTecnica fichaTecnica) {
        return "Exportando PDF...";
    }
}
