package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    

	// Datos de conexión a la base de datos
    private static final String URL = "jdbc:mysql://localhost:3306/bd";
    private static final String USER = "usuario";
    private static final String PASSWORD = "contraseña";

    // Objeto de conexión
    private static Connection connection;

    // Método para obtener la conexión a la base de datos
    public static Connection obtenerConexion() {
        if (connection == null) {
            try {
                // Cargar el driver de MySQL
                Class.forName("com.mysql.jdbc.Driver");
                // Establecer la conexión
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}