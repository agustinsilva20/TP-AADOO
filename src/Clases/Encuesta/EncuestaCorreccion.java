package Clases.Encuesta;

public class EncuestaCorreccion {
    private EncuestaCorreccion(Enum<Estado> estadoAnimal,Enum<Estado> estadoLimpieza,Enum<Estado> estadoAmbiente) {
        this.estadoAnimal = estadoAnimal;
        this.estadoLimpieza = estadoLimpieza;
        this.estadoAmbiente = estadoAmbiente;
    }


    public EncuestaCorreccion completarEncuesta(Enum<Estado> estadoAnimal,Enum<Estado> estadoLimpieza,Enum<Estado> estadoAmbiente){
        EncuestaCorreccion encuesta = new EncuestaCorreccion(estadoAnimal,estadoLimpieza,estadoAmbiente);

        return encuesta;
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
