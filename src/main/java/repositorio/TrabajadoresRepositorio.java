package repositorio;

import java.util.List;

import modelo.Trabajador;

	public interface TrabajadoresRepositorio {
		List<Trabajador> obtenerTodos();
		Trabajador obtenerPorId(String id);
		List<Trabajador> obtenerPorDni(String dni);
		List<Trabajador> obtenerPorNombre(String nombre);
		List<Trabajador> obtenerPorGenero(String genero);
		void crear(Trabajador trabajador);
		void actualizar(Trabajador trabajador);
		void eliminar(Trabajador trabajador);
		void eliminarPorId(String id);
		void eliminarPorDni(String dni);


	
	
	

}
