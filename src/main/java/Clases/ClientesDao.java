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
public class ClientesDao {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();

//Metodo para listar CLientes    
      public List ListarClientes(){
       List<Clientes> ListaCli = new ArrayList();
       String sql = "select * from controlarDatos.cliente;";
       try {
           con = cn.conectar();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Clientes clie = new Clientes();
               clie.setDpi(rs.getString("dpi"));
               clie.setNit(rs.getString("nit"));
               clie.setNombre(rs.getString("nombre"));
               clie.setApellido(rs.getString("apellido"));
               clie.setDireccion(rs.getString("direccion"));
               clie.setTelefono(rs.getInt("telefono"));
               ListaCli.add(clie);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return ListaCli;
   } 
//Metodo para modificar un cliente
      public boolean ModificarCliente(Clientes cl){
       String sql = "update controlarDatos.cliente set nit =?, nombre =?, apellido =?, direccion=?, telefono =? WHERE dpi = ?;";
       try {
           ps = con.prepareStatement(sql);
           ps.setString(1, cl.getNit());
           ps.setString(2, cl.getNombre());
           ps.setString(3, cl.getApellido());
           ps.setString(4, cl.getDireccion());
           ps.setInt(5,cl.getTelefono());
           ps.setString(6, cl.getDpi());
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
//Metodo para insertar un cliente
      public boolean insertarClie(Clientes reg){
        String sql = "INSERT INTO controlarDatos.cliente (dpi, nit, nombre, apellido, direccion, telefono) VALUES (?,?,?,?,?,?)";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, reg.getDpi());
            ps.setString(2, reg.getNit());
            ps.setString(3, reg.getNombre());
            ps.setString(4, reg.getApellido());
            ps.setString(5, reg.getDireccion());
            ps.setInt(6, reg.getTelefono());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
 //Metodo para buscar un cliente por el dpi   
   public Clientes BuscarClie(String dpi){
        Clientes cli = new Clientes();
        String sql = "select dpi, nombre from controlarDatos.cliente WHERE dpi=?;";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, dpi);
            rs = ps.executeQuery();
            if (rs.next()) {
                cli.setDpi(rs.getString("dpi"));
                cli.setNombre(rs.getString("nombre"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return cli;
    } 
//Metodo para buscar un cliente por algun caracter en especial
   public List BuscClien(String clien){
        List<Clientes> ListaClien = new ArrayList();    
                String sql = "SELECT * FROM controlarDatos.cliente WHERE nombre LIKE ? OR dpi LIKE ? OR nit LIKE ? OR apellido LIKE ?;";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + clien + "%");
            ps.setString(2, "%" + clien + "%");
            ps.setString(3, "%" + clien + "%");
            ps.setString(4, "%" + clien + "%");
            rs = ps.executeQuery();
  
            while (rs.next()) {
               Clientes cli = new Clientes();
               cli.setDpi(rs.getString("dpi"));
               cli.setNit(rs.getString("nit"));
               cli.setNombre(rs.getString("nombre"));
               cli.setApellido(rs.getString("apellido"));
               cli.setDireccion(rs.getString("direccion"));
               cli.setTelefono(rs.getInt("telefono"));
               ListaClien.add(cli);            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return ListaClien;
    }          
}
