package ClasesOld;
import java.util.*;

public class Cliente {

    public Cliente(String nombre, String apellido, Enum<EstadoCivil> estadoCivil, String email, Integer telefono, Enum<Ocupacion> ocupacion, Enum<TipoAnimalDomestico> tipoAnimalesInteresados, Boolean tieneMascotas) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.estadoCivil = estadoCivil;
        this.ocupacion = ocupacion;
        this.tipoAnimalesInteresados= tipoAnimalesInteresados;
        this.tieneMascotas = tieneMascotas;
        this.mascotasAdoptadas = new ArrayList<Animal>();
    }

    private String nombre;
    private String apellido;
    private Enum<EstadoCivil> estadoCivil;
    private String email;
    private Integer telefono;
    private Enum<Ocupacion> ocupacion;
    private Boolean tieneMascotas;
    private String motivoAdopcion;
    private Enum<TipoAnimalDomestico> tipoAnimalesInteresados;
    private List<Animal> mascotasAdoptadas;

    public int getCantidadMascotas() {
    	return mascotasAdoptadas.size();
    }

    public void agregarMascotaAdoptada(Animal mascota, Usuario usuario_seguimiento, Notificador notificador){
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
        mascota.setSeguimiento(this, usuario_seguimiento, notificador);
        tieneMascotas=true;
    }

}