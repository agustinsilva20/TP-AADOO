package Clases.Encuesta;

import java.time.LocalDate;
import java.time.LocalDateTime;

import Clases.Encuesta.Encuesta;
import Clases.Usuario.Usuario;

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
