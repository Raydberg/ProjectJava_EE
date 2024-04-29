package servlets.emp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Producto;
import modelo.ProductoDTO;
import modelo.Trabajador;
import repositorio.ProductosRepositorio;
import repositorio.SqlProductosRepositorio;
import repositorio.SqlTrabajadoresRepositorio;
import repositorio.TrabajadoresRepositorio;

@WebServlet("/TrabajadorServlet")
public class TrabajadorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public TrabajadorServlet() {super();}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ProductosRepositorio pr = new SqlProductosRepositorio();
		List<Producto> productos = pr.obtenerTodos();
		List<ProductoDTO> listaProductos = new ArrayList<ProductoDTO>();
		
		for (Producto producto : productos) {
			
			ProductoDTO productosDTO = new ProductoDTO();
			productosDTO.setId(producto.getId());
			productosDTO.setNombre(producto.getNombre());
			productosDTO.setMarca(producto.getMarca());
			productosDTO.setModelo(producto.getModelo());
			productosDTO.setProveedor(producto.getProveedor());
			productosDTO.setColor(producto.getColor());
			productosDTO.setUnidades(producto.getUnidades());
			listaProductos.add(productosDTO);
		}
		request.setAttribute("productos", listaProductos);
		request.getRequestDispatcher("/JSP/Trabajador.jsp").forward(request, response);
				
		
	}

}
