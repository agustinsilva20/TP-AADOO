package Clases.Alarma;

import Clases.Usuario.UsuarioCorreccion;

public class AlarmaAtendida implements EstadoAlarma {

    private UsuarioCorreccion veterinario;

    protected AlarmaAtendida(UsuarioCorreccion veterinario) {
        this.veterinario = veterinario;
    }

    @Override
    public void atenderAlarma(UsuarioCorreccion veterinario, AlarmaCorreccion alarma) {
        System.out.println("Alarma ya atendida.");
    }
}
