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
public class SucursalDao {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();

      public List ListarSucursal(){
       List<Sucursal> Lista = new ArrayList();
       String sql = "select * from controlarDatos.sucursal;";
       try {
           con = cn.conectar();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Sucursal lg = new Sucursal();
               lg.setIdSucur(rs.getInt("idsucur"));
               lg.setUbicacion(rs.getString("Ubicacion"));
               lg.setDireccion(rs.getString("direccion"));
               lg.setTelefono(rs.getInt("telefono"));
               lg.setDescripcion(rs.getString("descripcion"));
               Lista.add(lg);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return Lista;
   }    
      
        public Sucursal BuscarSucId(int num){
        Sucursal tie = new Sucursal();
        String sql = "select ubicacion from controlarDatos.sucursal where idsucur = ?";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, num);
            rs = ps.executeQuery();
            if (rs.next()) {
                tie.setUbicacion(rs.getString("Ubicacion"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return tie;
    }   
}
