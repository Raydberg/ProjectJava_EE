package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bd.SqlConexion;
import modelo.Trabajador;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public LoginServlet() {
		super();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		  String nombre = request.getParameter("nombre");
	        String contrasenia = request.getParameter("contrasenia");

	        try (Connection conexion = SqlConexion.obtenerConexion();
	                PreparedStatement ps = conexion
	                        .prepareStatement("SELECT * FROM Trabajadores WHERE nombre = ? AND contrasenia = ?");) {
	            ps.setString(1, nombre);
	            ps.setString(2, contrasenia);
	            ResultSet rs = ps.executeQuery();

	            if (rs.next()) {
	                Trabajador trabajador = new Trabajador(
	                        rs.getInt("id"), rs.getString("dni"), rs.getString("apellido"),
	                        rs.getString("nombre"), rs.getString("contrasenia"), rs.getDouble("salario"),
	                        rs.getString("email"), rs.getString("direccion"), rs.getString("genero"),
	                        rs.getString("fechaNacimiento"), rs.getInt("idPuesto"), rs.getString("telefono")

	                );
	                request.getSession().setAttribute("trabajador", trabajador);

	                if (trabajador.getIdPuesto() == 1) {
	                    response.sendRedirect("/TrabajorServlet");
	                } else if (trabajador.getIdPuesto() == 2) {
	                    response.sendRedirect("/AdminServlet");
	                } else {
	                    response.sendRedirect("JSP/Login.jsp");
	                }

	            } else {
	                response.sendRedirect("ReguisterUser.html");
	            }

	        } catch (SQLException e) {
	            System.out.println("Error en la consulta");
	            e.printStackTrace();
	        }

	}

}
