package Clases.Encuesta;

import Clases.Usuario.Usuario;

import java.util.Date;
import java.util.concurrent.atomic.DoubleAccumulator;

public class Visita {
    private Encuesta encuesta;
    private Date fecha;
    private Usuario visitador;

    public Visita(Encuesta encuesta, Date fecha, Usuario visitador) {
        this.encuesta = encuesta;
        this.fecha = fecha;
        this.visitador = visitador;
    }
}
