package Clases.Exportador;

import Clases.FichaTecnica.FichaTecnica;

public class AdapterExcel implements AdapterExportarExcel {
    @Override
    public String exportarExcel(FichaTecnica fichaTecnica) {
        //Exportar ficha en formato Excel...
        return "Exportando Excel...";
    }
}
