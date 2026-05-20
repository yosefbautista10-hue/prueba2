
package conexión;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    // Reemplaza con los datos de tu base de datos en la nube
    // Ejemplo: Railway, Supabase, Clever Cloud, etc.

    private static final String URL = "jdbc:mysql://tu_servidor_en_la_nube:3306/nombre_bd";
    private static final String USER = "tu_usuario";
    private static final String PASSWORD = "tu_contraseña";

    public static Connection conectar() {

        Connection conectar = null;

        try {
            // Cargar el driver de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Crear conexión
            conectar = DriverManager.getConnection(URL, USER, PASSWORD);

            System.out.println("Conexión exitosa a la nube.");

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }

        return conectar;
    }
}
