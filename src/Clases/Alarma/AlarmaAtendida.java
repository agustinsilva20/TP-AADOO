package Clases.Alarma;

import Clases.Usuario.Usuario;

public class AlarmaAtendida implements EstadoAlarma {

    private Usuario veterinario;

    public AlarmaAtendida(Usuario veterinario) {
        this.veterinario = veterinario;
    }

    @Override
    public void atenderAlarma(Usuario veterinario, Alarma alarma) {
        System.out.println("Alarma ya atendida.");
    }
}
