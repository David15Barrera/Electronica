package Clases;

import conexion.Conexion;
import java.sql.Date;
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
public class SolicitudDao {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    //Listar
      public List ListarProductosCom(){
       List<Solicitud> Lista = new ArrayList();
       String sql = "SELECT su1.Ubicacion as Ubicacion_Origen, su2.Ubicacion as Ubicacion_Destino, p.nombre as Producto, s.cantSol as Cantidad, s.fechaPedido as Fecha_Pedido, s.estado as Estado FROM controlarInven.solicitar s INNER JOIN controlarDatos.sucursal su1 ON s.sucurId = su1.idSucur INNER JOIN controlarDatos.sucursal su2 ON s.sucuorigen = su2.idSucur INNER JOIN controlarInven.producto p ON s.prodId = p.idProd;";
       try {
           con = cn.conectar();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Solicitud prod = new Solicitud();
               prod.setNomUbi2(rs.getString("ubicacion_origen"));
               prod.setNomUbi(rs.getString("ubicacion_destino"));
               prod.setNomProd(rs.getString("producto"));
               prod.setSoliCant(rs.getInt("cantidad"));
               prod.setSoliFecha(rs.getDate("fecha_pedido"));
               prod.setEstado(rs.getString("estado"));
               Lista.add(prod);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return Lista;
   }
    //Registrar ventas   
        public boolean RegistrarVenta(Solicitud ven){
        String sql = "INSERT INTO controlarInven.solicitar (sucurid, sucuorigen, prodid, cantsol, fechapedido, estado) VALUES (?,?,?,?,?,?)";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, ven.getSoliSucuId());
            ps.setInt(2, ven.getSoliSucuOrigen());
            ps.setString(3, ven.getSoliProd());
            ps.setInt(4, ven.getSoliCant());
            ps.setDate(5, (Date) ven.getSoliFecha());
            ps.setString(6, ven.getEstado());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
     public List ListarSolPorID(int num){
       List<Solicitud> Lista = new ArrayList();
       String sql = "SELECT s.soliid as idSol, su1.Ubicacion as Ubicacion_Origen, su2.Ubicacion as Ubicacion_Destino, p.nombre as Producto, s.cantSol as Cantidad, s.fechaPedido as Fecha_Pedido, s.estado as Estado FROM controlarInven.solicitar s INNER JOIN controlarDatos.sucursal su1 ON s.sucurId = su1.idSucur INNER JOIN controlarDatos.sucursal su2 ON s.sucuorigen = su2.idSucur INNER JOIN controlarInven.producto p ON s.prodId = p.idProd WHERE sucurId = ?;";
       try {
           con = cn.conectar();
           ps = con.prepareStatement(sql);
           ps.setInt(1, num);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Solicitud prod = new Solicitud();
               prod.setSoliId(rs.getInt("idsol"));
               prod.setNomUbi(rs.getString("ubicacion_origen"));
               prod.setNomUbi2(rs.getString("ubicacion_destino"));
               prod.setNomProd(rs.getString("producto"));
               prod.setSoliCant(rs.getInt("cantidad"));
               prod.setSoliFecha(rs.getDate("fecha_pedido"));
               prod.setEstado(rs.getString("estado"));
               Lista.add(prod);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return Lista;
   }   
     //Metodo para buscar una solicitud por medio del ID      
      public Solicitud BuscarSol(int cod){
        Solicitud pro = new Solicitud();
        String sql = "SELECT * FROM controlarInven.solicitar WHERE soliid = ?;";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cod);
            rs = ps.executeQuery();
            if (rs.next()) {
               pro.setSoliId(rs.getInt("soliid"));
               pro.setSoliSucuId(rs.getInt("sucurid"));
               pro.setSoliSucuOrigen(rs.getInt("sucuorigen"));
               pro.setSoliProd(rs.getString("prodid"));
               pro.setSoliCant(rs.getInt("cantsol"));
               pro.setSoliFecha(rs.getDate("fechapedido"));
               pro.setEstado(rs.getString("estado"));

            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return pro;
    }
      //Modificar una sucursal
      public boolean modiApro(String est, int Sol){
       String sql = "UPDATE controlarInven.solicitar SET estado = ? WHERE soliId = ?;";
       try {
          con = cn.conectar();
          ps = con.prepareStatement(sql);
          ps.setString(1, est);
          ps.setInt(2, Sol);
          ps.execute();
           return true;
           } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
   }
      
  //Modificar Cantidad
      public boolean modiCantEdit(int cant, int Sol){
       String sql = "UPDATE controlarInven.solicitar SET cantidad = ? WHERE prodId = ? AND sucurId;";
       try {
          con = cn.conectar();
          ps = con.prepareStatement(sql);
          ps.setInt(1, cant);
          ps.setInt(2, Sol);
          ps.execute();
           return true;
           } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
   }
}
