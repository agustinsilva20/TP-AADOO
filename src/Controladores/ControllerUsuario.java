package Controladores;

import Clases.Notificador.NotificadorWhatsapp;
import Clases.Usuario.TipoUsuario;
import Clases.Usuario.Usuario;
import Clases.Usuario.UsuarioCorreccion;

import java.util.List;

public class ControllerUsuario {

    private static ControllerUsuario instance;
    private static List<UsuarioCorreccion> usuarios;

    private void instanciarUsuarios() {
        usuarios.add(new UsuarioCorreccion("Juan Ignacio", "Gomez", "juangomez@puppies.com", 1155532123, "Juani", TipoUsuario.VISITADOR, "1234"));
        usuarios.add(new UsuarioCorreccion("Agustin", "Silva", "agustin@hotmail.com", 1156223610, "agussilva20", TipoUsuario.VETERINARIO, "1234"));
        usuarios.add(new UsuarioCorreccion("Agusstin", "Ssilva", "agustins@hotmail.com", 1156223610, "agussilva21", TipoUsuario.VETERINARIO, "1234"));
        usuarios.add(new UsuarioCorreccion("Juani", "Alippi", "alippi@hotmail.com", 1156223610, "Juani03", TipoUsuario.VISITADOR, "1234"));
    }

    private ControllerUsuario(){}

    public static ControllerUsuario getInstance(){
        if (instance == null){
            instance = new ControllerUsuario();
            instance.instanciarUsuarios();
        }
        return instance;
    }

    public List<UsuarioCorreccion> getUsuarios(){
        return usuarios;
    }
}
