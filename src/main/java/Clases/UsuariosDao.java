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
public class UsuariosDao {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    
    public Usuarios log(String nombreUser){
        Usuarios l = new Usuarios();
        String sql = "select nombre, apellido, cargo, contras, sucurIdUser FROM controlarDatos.usuario WHERE nombre = ?;";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombreUser);
            rs= ps.executeQuery();
            if (rs.next()) {
                l.setNombre(rs.getString("nombre"));
                l.setApellido(rs.getString("apellido"));
                l.setCargo(rs.getString("cargo"));
                l.setContras(rs.getString("contras"));
                l.setSucuriduser(rs.getInt("sucurIdUser"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return l;
    }
    
       public List ListarUsuarios(){
       List<Usuarios> Lista = new ArrayList();
       String sql = "select * from controlarDatos.usuario;";
       try {
           con = cn.conectar();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Usuarios lg = new Usuarios();
               lg.setIdUser(rs.getString("idUser"));
               lg.setNombre(rs.getString("nombre"));
               lg.setApellido(rs.getString("apellido"));
               lg.setDireccion(rs.getString("direccion"));
               lg.setTelefono(rs.getInt("telefono"));
               lg.setCargo(rs.getString("cargo"));
               lg.setContras(rs.getString("contras"));
               lg.setSucuriduser(rs.getInt("Sucuriduser"));
               Lista.add(lg);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return Lista;
   }
         
      public List ListarCat(){
       List<Usuarios> Lista = new ArrayList();
       String sql = "select sucuriduser from controlarDatos.usuario GROUP BY sucuriduser;";
       try {
           con = cn.conectar();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Usuarios pro = new Usuarios();
               pro.setSucuriduser(rs.getInt("sucuriduser"));
               Lista.add(pro);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return Lista;
   }  
      
      
}
