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
        public boolean modificarSucursal(Sucursal sucu){
       String sql = "UPDATE controlarDatos.sucursal set Ubicacion=?, direccion =?, telefono =?, descripcion=? WHERE idSucur = ?;";
       try {
           ps = con.prepareStatement(sql);
          ps.setString(1, sucu.getUbicacion());
          ps.setString(2, sucu.getDireccion());
          ps.setInt(3, sucu.getTelefono());
          ps.setString(4, sucu.getDescripcion());
          ps.setInt(5, sucu.getIdSucur());
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
        public boolean insertarSucursal(Sucursal reg){
        String sql = "INSERT INTO controlarDatos.sucursal (Ubicacion, direccion, telefono, descripcion) VALUES (?,?,?,?)";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, reg.getUbicacion());
            ps.setString(2, reg.getDireccion());
            ps.setInt(3, reg.getTelefono());
            ps.setString(4, reg.getDescripcion());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
        
         public boolean eliminarSucursal(int suc){
        String sql = "DELETE FROM controlarDatos.sucursal WHERE idSucur = ? ";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, suc);
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
    public List ListarSucu(){
       List<Sucursal> Lista = new ArrayList();
       String sql = "SELECT idsucur FROM controlarDatos.sucursal GROUP BY idsucur;";
       try {
           con = cn.conectar();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Sucursal pro = new Sucursal();
               pro.setIdSucur(rs.getInt("idsucur"));
               Lista.add(pro);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return Lista;
   }
}
