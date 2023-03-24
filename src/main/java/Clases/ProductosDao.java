package Clases;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author david
 */
public class ProductosDao {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    
      public List ListarProd(int num){
       List<Productos> Lista = new ArrayList();
       String sql = "select * from controlarInven.producto WHERE sucurorigin =?;";
       try {
           con = cn.conectar();
           ps = con.prepareStatement(sql);
           ps.setInt(1, num);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Productos prod = new Productos();
               prod.setIdProd(rs.getString("idProd"));
               prod.setNombreProd(rs.getString("nombre"));
               prod.setCategoria(rs.getString("categoria"));
               prod.setDescripcion(rs.getString("descripcion"));
               prod.setPrecio(rs.getDouble("precio"));
               prod.setStock(rs.getInt("stock"));
               prod.setSucurorigin(rs.getInt("sucurOrigin"));
               Lista.add(prod);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return Lista;
   }
    
}
