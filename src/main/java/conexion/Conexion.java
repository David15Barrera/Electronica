package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author david
 */
public class Conexion {
    public static Connection dbconnection = null;
    String url = "jdbc:postgresql://localhost:5432/electronic";
    String user = "postgres";
    String password = "Sistemas";
    
    
    public boolean conectar(){
        try{
            dbconnection = DriverManager.getConnection(url, user, password);
            return true;
         }catch (Exception e){
             System.err.print("Error al conectar la base de datos: " + e.getMessage());
             return false;
         }
    }
}
