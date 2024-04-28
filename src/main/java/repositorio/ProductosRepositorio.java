package repositorio;

import java.util.List;

import modelo.Producto;

public interface ProductosRepositorio {
	List<Producto> obtenerTodos();
	Producto obtenerPorId(String id);
	List<Producto> obtenerPorNombre(String nombre);
	List<Producto> obtenerPorMarca(String marca);
	List<Producto> obtenerPorModelo(String modelo);
	void crear(Producto producto);
	void actualizar(Producto producto);
	void eliminar(Producto producto);
	void eliminar(String id);
}
