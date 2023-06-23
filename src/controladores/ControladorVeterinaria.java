package controladores;
import java.util.List;
import java.util.ArrayList;

import Clases.*;
import Clases.Cliente.Cliente;
import Clases.Cliente.EstadoCivil;
import Clases.Cliente.Ocupacion;
import Clases.Cliente.TipoAnimalDomestico;
import Clases.Usuario.TipoUsuario;
import Clases.Usuario.Usuario;

public class ControladorVeterinaria {
	private List<Usuario> usuarios;
	private List<Cliente> clientes;
	
	
	public ControladorVeterinaria(){
		this.usuarios = new ArrayList<Usuario>();
		this.clientes = new ArrayList<Cliente>();
		
	}
	
	public String crearUsuario(String nombre, String apellido, String email, int telefono, String nombreUser, String tipoUsuario, String contrasenia) {
		// String nombre, String apellido, String email, int telefono, String nombreUser, Enum<TipoUsuario> tipoUsuario, String contrasenia 
		TipoUsuario tipo;
		if (tipoUsuario == "VET") {
			tipo = TipoUsuario.VETERINARIO;
		}
		else if (tipoUsuario == "VIS") {
			tipo = TipoUsuario.VISITADOR;
		}
		else {
			return "Error el tipo de usuario no es correcto";
		}
		Usuario usuario = new Usuario(nombre, apellido, email, telefono, nombreUser, tipo, contrasenia);
		usuarios.add(usuario);
		return "Usuario creado correctamente";
	}
	
	public String crearCliente(String nombre, String apellido, String estadoCivil, String email, Integer telefono, 
			String ocupacion, String tipoAnimalesInteresados, Boolean tieneMascotas) {

		EstadoCivil estado_civil;
		TipoAnimalDomestico tipo_animales_interesados;
		Ocupacion ocupacion_cliente;
		
		// Estado Civil
		if (estadoCivil == "S") {
			estado_civil = EstadoCivil.SOLTERO;
		}
		else if (estadoCivil == "C") {
			estado_civil = EstadoCivil.CASADO;
		}
		else if (estadoCivil == "D") {
			estado_civil = EstadoCivil.DIVORCIADO;
		}
		else if (estadoCivil == "V") {
			estado_civil = EstadoCivil.VIUDO;
		}
		else {
			estado_civil = EstadoCivil.OTRO;
		}
		
		// Animales interesados
		if (tipoAnimalesInteresados == "P") {
			tipo_animales_interesados = TipoAnimalDomestico.PERRO;
		}
		else if (tipoAnimalesInteresados == "G") {
			tipo_animales_interesados = TipoAnimalDomestico.GATO;
		}
		else if (tipoAnimalesInteresados == "T") {
			tipo_animales_interesados = TipoAnimalDomestico.TORTUGA;
		}
		else if (tipoAnimalesInteresados == "R") {
			tipo_animales_interesados = TipoAnimalDomestico.ROEDOR;
		}
		else if (tipoAnimalesInteresados == "A") {
			tipo_animales_interesados = TipoAnimalDomestico.AVE;
		}
		else {
			tipo_animales_interesados = TipoAnimalDomestico.OTRO;
		}
		
		// ocupacion_cliente
		if (ocupacion == "ES") {
			ocupacion_cliente = Ocupacion.ESTUDIANTE;
		}
		else if (ocupacion == "EM") {
			ocupacion_cliente = Ocupacion.EMPLEADO;
		}
		else if (ocupacion == "DE") {
			ocupacion_cliente = Ocupacion.DESEMPLEADO;
		}
		else {
			ocupacion_cliente = Ocupacion.OTRO;
		}
		
		Cliente cliente = new Cliente(nombre, apellido, estado_civil, email, telefono, 
				ocupacion_cliente, tipo_animales_interesados, tieneMascotas);
		
		clientes.add(cliente);
		return "Usuario creado exitosamente";
	}
}
