package Clases.Encuesta;

import Clases.Usuario.Usuario;

import java.time.LocalDateTime;

public class VisitaCorreccion {
    private Encuesta encuesta;

    private LocalDateTime fecha;

    private Usuario visitador;

    public VisitaCorreccion(LocalDateTime fecha, Usuario visitador) {
        this.fecha = fecha;
        this.visitador = visitador;
    }

    public void completarEncuesta(Enum<Estado> estadoAnimal,Enum<Estado> estadoLimpieza,Enum<Estado> estadoAmbiente){
        this.encuesta = encuesta.completarEncuesta(estadoAnimal,estadoLimpieza,estadoAmbiente);
    }
}
