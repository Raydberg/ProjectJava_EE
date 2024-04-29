package repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bd.SqlConexion;
import modelo.Producto;

public class SqlProductosRepositorio implements ProductosRepositorio {

	@Override
	public List<Producto> obtenerTodos() {
List<Producto> productos = new ArrayList<Producto>();
		
		String sql = "select*from Productos";
		
		try (				
			Connection connection = SqlConexion.obtenerConexion();
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
				)	
		{
			ResultSet rs = preparedStatement.executeQuery();
			while(rs.next()) {
                Integer id = rs.getInt("id");
                String nombre = rs.getString("nombre");
                String marca = rs.getString("marca");
                String modelo = rs.getString("modelo");
                String proveedor = rs.getString("proveedor_por_mayor");
                String color = rs.getString("colores");
                int unidades = rs.getInt("unidades");
                productos.add(new Producto(id, nombre,  marca,  modelo,  proveedor,  color,  unidades));
			
			  }
			} catch (SQLException e) {
			System.out.println("Error en la consulta de productos");
			e.printStackTrace();
		}
		return productos;
	}

	@Override
	public Producto obtenerPorId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Producto> obtenerPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Producto> obtenerPorMarca(String marca) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Producto> obtenerPorModelo(String modelo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void crear(Producto producto) {
		String sql = "insert into Productos (id,nombre, marca, modelo, proveedor_por_mayor, colores, unidades) values (?,?,?,?,?,?,?)";
		
		try(Connection connection = SqlConexion.obtenerConexion();
				PreparedStatement pre = connection.prepareStatement(sql);
			)
		{
			pre.setInt(1, producto.getId());
			pre.setString(2, producto.getNombre());
			pre.setString(3, producto.getMarca());
			pre.setString(4, producto.getModelo());
			pre.setString(5, producto.getProveedor());
			pre.setString(6, producto.getColor());
			pre.setInt(7, producto.getUnidades());
			pre.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println("Error en la creacion de productos");
			e.printStackTrace();
		}

	}

	@Override
	public void actualizar(Producto producto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Producto producto) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub

	}

}
