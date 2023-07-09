package Clases.Cliente;

import Clases.Animal.Animal;
import Clases.Animal.AnimalCorreccion;
import Clases.Notificador.EstrategiaNotificacion;
import Clases.Usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

public class ClienteCorreccion {

    public ClienteCorreccion(String nombre, String apellido, Enum<EstadoCivil> estadoCivil, String email, Integer telefono, Enum<Ocupacion> ocupacion, Enum<TipoAnimalDomestico> tipoAnimalesInteresados) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.estadoCivil = estadoCivil;
        this.ocupacion = ocupacion;
        this.tipoAnimalesInteresados= tipoAnimalesInteresados;
        //this.tieneMascotas = tieneMascotas;
        this.mascotasAdoptadas = new ArrayList<AnimalCorreccion>();
    }

    private String nombre;
    private String apellido;
    private Enum<EstadoCivil> estadoCivil;
    private String email;
    private Integer telefono;
    private Enum<Ocupacion> ocupacion;
    //private Boolean tieneMascotas;
    private String motivoAdopcion;
    private Enum<TipoAnimalDomestico> tipoAnimalesInteresados;
    private List<AnimalCorreccion> mascotasAdoptadas;



    public int getCantidadMascotas() {
        return mascotasAdoptadas.size();
    }


    public void agregarMascotaAdoptada(AnimalCorreccion mascota, Usuario usuario_seguimiento, EstrategiaNotificacion estrategiaNotificacion){
        if (mascota.getSalvaje() == true) {
            return ;
        }
        if (mascota.enTratamiento() == true) {
            return ;
        }
        if (getCantidadMascotas()>= 2) {
            return ;
        }
        mascotasAdoptadas.add(mascota);
        //mascota.setSeguimiento(this, usuario_seguimiento, estrategiaNotificacion);
        //tieneMascotas=true;
    }
}
