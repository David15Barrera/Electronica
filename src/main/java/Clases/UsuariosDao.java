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
               lg.setIdUser(rs.getInt("idUser"));
               lg.setNombre(rs.getString("nombre"));
               lg.setApellido(rs.getString("apellido"));
               lg.setDireccion(rs.getString("direccion"));
               lg.setTelefono(rs.getInt("telefono"));
               lg.setCargo(rs.getString("cargo"));
               lg.setContras(rs.getString("contras"));
               lg.setSucuriduser(rs.getInt("Sucuriduser"));
               lg.setDpiUser(rs.getString("userdpi"));
               Lista.add(lg);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return Lista;
   }
         
      public List ListarCat(){
       List<Usuarios> Lista = new ArrayList();
       String sql = "select idSucur from controlarDatos.sucursal ORDER BY idSucur;";
       try {
           con = cn.conectar();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Usuarios pro = new Usuarios();
               pro.setSucuriduser(rs.getInt("idSucur"));
               Lista.add(pro);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return Lista;
   }  
      
   public boolean ModificarUsuario(Usuarios user){
       String sql = "update controlarDatos.usuario set nombre=?, apellido =?, sucurIdUser =?, direccion=?, telefono =?, cargo=?, contras=? WHERE userdpi = ?;";
       try {
           ps = con.prepareStatement(sql);
           ps.setString(1, user.getNombre());
           ps.setString(2, user.getApellido());
           ps.setInt(3, user.getSucuriduser());
           ps.setString(4, user.getDireccion());
           ps.setInt(5, user.getTelefono());
           ps.setString(6, user.getCargo());
           ps.setString(7, user.getContras());
           ps.setString(8, user.getDpiUser());
           ps.execute();
           return true;
       } catch (SQLException e) {
           System.out.println(e.toString());
           return false;
       }finally{
           try {
               con.close();
           } catch (SQLException e) {
               System.out.println(e.toString());
           }
       }
   }
    public boolean insertarUser(Usuarios reg){
        String sql = "INSERT INTO controlarDatos.usuario (nombre, apellido, direccion, telefono, cargo, contras, sucuriduser, userdpi) VALUES (?,?,?,?,?,?,?,?)";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, reg.getNombre());
            ps.setString(2, reg.getApellido());
            ps.setString(3, reg.getDireccion());
            ps.setInt(4, reg.getTelefono());
            ps.setString(5, reg.getCargo());
            ps.setString(6, reg.getContras());
            ps.setInt(7, reg.getSucuriduser());
            ps.setString(8, reg.getDpiUser());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
     public boolean eliminarUsuario(String dpi){
        String sql = "DELETE FROM controlarDatos.usuario WHERE userdpi = ? ";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, dpi);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
    }
     
    public Usuarios BuscUser(String name, String apell){
       Usuarios user = new Usuarios();   
        String sql = "SELECT iduser, sucuriduser FROM controlarDatos.usuario WHERE nombre=? AND apellido=?";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, apell);
            rs = ps.executeQuery();
            if (rs.next()) {
                user.setIdUser(rs.getInt("iduser"));
                user.setSucuriduser(rs.getInt("sucuriduser"));
            }
            } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return user; 
    } 
}
