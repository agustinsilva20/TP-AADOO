package Clases.Encuesta;
import java.util.*;

public class Encuesta {

    public Encuesta(Enum<Estado> estadoAnimal,Enum<Estado> estadoLimpieza,Enum<Estado> estadoAmbiente) {
        this.estadoAnimal = estadoAnimal;
        this.estadoLimpieza = estadoLimpieza;
        this.estadoAmbiente = estadoAmbiente;
    }

    private Enum<Estado> estadoAnimal;
    private Enum<Estado> estadoLimpieza;
    private Enum<Estado> estadoAmbiente;

    public Enum<Estado> getEstadoAnimal() {
        return estadoAnimal;
    }

    public void setEstadoAnimal(Enum<Estado> estadoAnimal) {
        this.estadoAnimal = estadoAnimal;
    }

    public Enum<Estado> getEstadoLimpieza() {
        return estadoLimpieza;
    }

    public void setEstadoLimpieza(Enum<Estado> estadoLimpieza) {
        this.estadoLimpieza = estadoLimpieza;
    }

    public Enum<Estado> getEstadoAmbiente() {
        return estadoAmbiente;
    }

    public void setEstadoAmbiente(Enum<Estado> estadoAmbiente) {
        this.estadoAmbiente = estadoAmbiente;
    }
}