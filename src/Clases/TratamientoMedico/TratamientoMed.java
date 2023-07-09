package Clases.TratamientoMedico;

import Clases.Usuario.Usuario;

public class TratamientoMed {
    public TratamientoMed(Usuario veterinario, String descripcion) {
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
