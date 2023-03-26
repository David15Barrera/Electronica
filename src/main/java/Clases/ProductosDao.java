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
    public Productos BuscarPro(String codProd){
        Productos pro = new Productos();
        String sql = "SELECT * FROM controlarInven.producto WHERE idProd = ?";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, codProd);
            rs = ps.executeQuery();
            if (rs.next()) {
               pro.setNombreProd(rs.getString("nombre"));
               pro.setCategoria(rs.getString("categoria"));
               pro.setDescripcion(rs.getString("descripcion"));
               pro.setPrecio(rs.getDouble("precio"));
               pro.setStock(rs.getInt("stock"));
               pro.setSucurorigin(rs.getInt("sucurOrigin"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return pro;
    }
}
