package servlet.productos;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Producto;
import repositorio.ProductosRepositorio;
import repositorio.SqlProductosRepositorio;

@WebServlet("/ProductoCrear")
public class ProductoCrear extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public ProductoCrear() {super();}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int idProducto = Integer.valueOf(request.getParameter("id"));
		String nombre = request.getParameter("nombre");
		String marca = request.getParameter("marca");
		String modelo = request.getParameter("modelo");
		String proveedor = request.getParameter("proveedor");
		String color= request.getParameter("color");
		int unidades =Integer.valueOf(request.getParameter("unidades"));
		Producto producto = new Producto(idProducto, nombre, marca, modelo, proveedor, color, unidades);
		ProductosRepositorio pr = new SqlProductosRepositorio();
		pr.crear(producto);
		response.sendRedirect("./TrabajadorServlet");
	}

}
