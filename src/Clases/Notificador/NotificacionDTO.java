package Clases.Notificador;

import Clases.Cliente.Cliente;
import Clases.Usuario.Usuario;

public class NotificacionDTO {

    private String mensaje;
    private Usuario usuario;
    private Cliente cliente;

    public NotificacionDTO(String mensaje, Usuario usuario, Cliente cliente) {
        this.mensaje = mensaje;
        this.usuario = usuario;
        this.cliente = cliente;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
