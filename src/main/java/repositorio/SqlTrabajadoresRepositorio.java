package repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bd.SqlConexion;
import modelo.Trabajador;

public class SqlTrabajadoresRepositorio implements TrabajadoresRepositorio {

	@Override
	public List<Trabajador> obtenerTodos() {
		 List<Trabajador> trabajadores = new ArrayList<Trabajador>();
	        String sql = "select*from Trabajadores";

	        try(
	        Connection connection = SqlConexion.obtenerConexion();
	            PreparedStatement preparedStatement = connection.prepareStatement(sql);)
	        {
	            ResultSet rs = preparedStatement.executeQuery();
	            while(rs.next()){
	                Integer id = rs.getInt("id");
	                String dni = rs.getString("dni");
	                String nombre = rs.getString("nombre");
	                String apellido = rs.getString("apellido");
	                Integer idPuesto = rs.getInt("puesto");
	                String fechaNacimiento = rs.getString("fecha_nacimiento");
	                String genero = rs.getString("genero");
	                String direccion = rs.getString("direccion");
	                String telefono = rs.getString("telefono");
	                String email = rs.getString("correo_electronico");
	                Double salario = rs.getDouble("salario");
	                String contrasenia = rs.getString("contrasenia");
	                trabajadores.add(new Trabajador(id,  dni, apellido,  nombre,  contrasenia,  salario,  email, direccion,  genero, fechaNacimiento, idPuesto, telefono));
	            }
	        } catch (SQLException e) {
	            System.out.println("Error en la consulta de trabajadores");
	            throw new RuntimeException(e);
	        }

	        return trabajadores;
	}

	@Override
	public Trabajador obtenerPorId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Trabajador> obtenerPorDni(String dni) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Trabajador> obtenerPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Trabajador> obtenerPorGenero(String genero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void crear(Trabajador trabajador) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizar(Trabajador trabajador) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Trabajador trabajador) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarPorId(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminarPorDni(String dni) {
		// TODO Auto-generated method stub

	}

}
