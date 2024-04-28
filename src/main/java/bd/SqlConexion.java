package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlConexion {

	public static Connection obtenerConexion() {
		Connection conexion = null;

		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String url = "jdbc:sqlserver://localhost;encrypt=false;database=TonyCard;user=ray;password=2005;";
			conexion = DriverManager.getConnection(url);
			
		} catch (SQLException e) {
			System.out.println("Error en la conexcion a SQL" + e);
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Error en en DriverSQL" + e);
			e.printStackTrace();
		}
		return conexion;
	}
	
}
