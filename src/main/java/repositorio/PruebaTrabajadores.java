package repositorio;

import java.util.List;

import modelo.Trabajador;

public class PruebaTrabajadores {

	public static void main(String[] args) {
		SqlTrabajadoresRepositorio repositorio = new SqlTrabajadoresRepositorio();
		List<Trabajador> trabajadores = repositorio.obtenerTodos();

		for (Trabajador trabajador : trabajadores) {
			System.out.println("ID: " + trabajador.getId());
			System.out.println("DNI: " + trabajador.getDni());
			System.out.println("Nombre: " + trabajador.getNombre());
			System.out.println("Apellido: " + trabajador.getApellido());
			System.out.println("Puesto: " + trabajador.getIdPuesto());
			System.out.println("FechaNaci: " + trabajador.getFechaNacimiento());
			System.out.println("Genero: " + trabajador.getGenero());
			System.out.println("Direccion: " + trabajador.getDireccion());
			System.out.println("Telefono: " + trabajador.getTelefono());
			System.out.println("email: " + trabajador.getEmail());
			System.out.println("Salario: " + trabajador.getSalario());
			System.out.println("Contraseña " + trabajador.getContrasenia());
			System.out.println("___________________________");
		}


	}

}
