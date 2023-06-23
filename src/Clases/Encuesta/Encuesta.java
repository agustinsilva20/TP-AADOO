package Clases.Encuesta;
import java.util.*;

/**
 * 
 */
public class Encuesta {

    /**
     * Default constructor
     */
    public Encuesta(Enum<Estado> estadoAnimal,Enum<Estado> estadoLimpieza,Enum<Estado> estadoAmbiente) {
        this.estadoAnimal = estadoAnimal;
        this.estadoLimpieza = estadoLimpieza;
        this.estadoAmbiente = estadoAmbiente;
    }

    /**
     * 
     */
    private Enum<Estado> estadoAnimal;

    /**
     * 
     */
    private Enum<Estado> estadoLimpieza;

    /**
     * 
     */
    private Enum<Estado> estadoAmbiente;

}