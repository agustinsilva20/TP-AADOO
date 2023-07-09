package Clases.Alarma;

import Clases.Usuario.UsuarioCorreccion;

public interface EstadoAlarma {
    void atenderAlarma(UsuarioCorreccion veterinario, AlarmaCorreccion alarma);
}
