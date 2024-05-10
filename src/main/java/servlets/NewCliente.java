package servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bd.SqlConexion;

@WebServlet("/NewCliente")
public class NewCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public NewCliente() {super();}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nombre = request.getParameter("nombre");
        String correo = request.getParameter("correo");
        String dni = request.getParameter("dni");
        String contrasenia = request.getParameter("contrasenia");
        
        try (Connection conn = SqlConexion.obtenerConexion()) { // Asegúrate de que este método coincida con tu clase SqlConexion
            String query = "INSERT INTO Trabajadores (nombre, correo, dni, contrasenia) VALUES (?, ?, ?, ?)";
            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                pstmt.setString(1, nombre);
                pstmt.setString(2, correo);
                pstmt.setString(3, dni);
                pstmt.setString(4, contrasenia);
                
                pstmt.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejar la excepción adecuadamente
        }
        
        // Redirigir al usuario a una página de confirmación o de inicio de sesión
        response.sendRedirect("LoginUser.html");
	}

}
