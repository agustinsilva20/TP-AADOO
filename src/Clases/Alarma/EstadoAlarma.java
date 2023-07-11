package Clases.Alarma;

import Clases.Usuario.Usuario;

public interface EstadoAlarma {
    void atenderAlarma(Usuario veterinario, Alarma alarma);
}
