package repositorio;

import java.util.List;

import modelo.Producto;

public class PruebaProductos {

	public static void main(String[] args) {
		SqlProductosRepositorio repositorio = new SqlProductosRepositorio();
		List<Producto> productos = repositorio.obtenerTodos();
		
		for (Producto producto : productos) {
			System.out.println("ID" + producto.getId());
			System.out.println("Nombre : " + producto.getNombre());
			System.out.println("Marca : " + producto.getMarca());
			System.out.println("Modelo : " + producto.getModelo());
			System.out.println("Proveedor : " + producto.getProveedor());
			System.out.println("Color : " + producto.getColor());
			System.out.println("Unidades : " + producto.getUnidades());
			System.out.println("___________________________");
		}

	}

}
