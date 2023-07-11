package Clases.Alarma;

import Clases.Usuario.TipoUsuario;
import Clases.Usuario.Usuario;

public class AlarmaPendiente implements EstadoAlarma{

    @Override
    public void atenderAlarma(Usuario veterinario, Alarma alarma) {
        if (veterinario.getTipoUsuario() == TipoUsuario.VETERINARIO){
            alarma.cambiarEstado(new AlarmaAtendida(veterinario));
        } else {
            System.out.println("Solo los veterinarios estan autorizados a atender alarmas.");
        }

    }
}
