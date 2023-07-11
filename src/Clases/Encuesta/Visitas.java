package Clases.Encuesta;

import Clases.Usuario.Usuario;

import java.time.LocalDateTime;

public class Visitas {
    private Encuesta encuesta;

    private LocalDateTime fecha;

    private Usuario visitador;

    public Visitas(Encuesta encuesta, LocalDateTime fecha, Usuario visitador) {
        this.encuesta = encuesta;
        this.fecha = fecha;
        this.visitador = visitador;
    }
}
