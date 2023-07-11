package Controladores;

import Clases.Autenticador.Autentificador;
import Clases.Autenticador.ModuloAutenticacionAdapter;
import Clases.Usuario.TipoUsuario;
import Clases.Usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

public class ControllerUsuario {

    private static ControllerUsuario instance;
    private static List<Usuario> usuarios = new ArrayList<>();

    private static Autentificador autenticador = new ModuloAutenticacionAdapter();

    private void instanciarUsuarios() {
        usuarios.add(new Usuario("Juan Ignacio", "Gomez", "juangomez@puppies.com", 1155532123, "Juani", TipoUsuario.VETERINARIO, "1234"));
        autenticador.registro("Juani","1234");
        usuarios.add(new Usuario("Agustin", "Silva", "agustin@hotmail.com", 1156223610, "agussilva20", TipoUsuario.VETERINARIO, "1234"));
        autenticador.registro("agussilva20","1234");
        usuarios.add(new Usuario("Agusstin", "Ssilva", "agustins@hotmail.com", 1156223610, "agussilva21", TipoUsuario.VETERINARIO, "1234"));
        autenticador.registro("agussilva21","1234");
        usuarios.add(new Usuario("Juani", "Alippi", "alippi@hotmail.com", 1156223610, "Juani03", TipoUsuario.VISITADOR, "1234"));
        autenticador.registro("Juani03","1234");
    }

    private ControllerUsuario(){}

    public static ControllerUsuario getInstance(){
        if (instance == null){
            instance = new ControllerUsuario();
            instance.instanciarUsuarios();
        }
        return instance;
    }

    public List<Usuario> getVeterinarios(){
        List<Usuario> veterinarios = new ArrayList<>();

        if (usuarios.size() > 0){
            for(Usuario u: usuarios){
                if (u.getTipoUsuario() == TipoUsuario.VETERINARIO){
                    veterinarios.add(u);
                }
            }

        }
        return veterinarios;
    }

    public List<Usuario> getUsuarios(){
        return usuarios;
    }

    public Boolean autenticar(String nombre, String contrasenia){
        return autenticador.login(nombre,contrasenia);
    }

    public Boolean registrar(String nombre, String contrasenia){
        return autenticador.registro(nombre,contrasenia);
    }
}
