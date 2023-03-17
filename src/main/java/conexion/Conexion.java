package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author david
 */
public class Conexion {

    String url = "jdbc:postgresql://localhost:5432/electronic";
    String user = "postgres";
    String password = "Sistemas";
    private Connection dbconnection = null;    
    
    public Connection conectar(){
        try{
            dbconnection = DriverManager.getConnection(url, user, password);
                System.out.println("Al fin nos conectamos");         
         }catch (Exception e){
             System.err.print("Error al conectar la base de datos: " + e.getMessage());
             return null;
         }
        return dbconnection;
    }
}
