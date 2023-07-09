package Clases.TratamientoMedico;

import java.util.*;

import Clases.Usuario.Usuario;

public class TratamientoMedico {

    public TratamientoMedico(Usuario veterinario, String descripcion) {
        this.veterinario = veterinario;
        this.descripcion = descripcion;
        this.finalizado = false;
    }

    private Usuario veterinario;

    private String descripcion;

    private Boolean finalizado;

    public void finalizarTratamiento() {
        this.finalizado = true;
    }


}