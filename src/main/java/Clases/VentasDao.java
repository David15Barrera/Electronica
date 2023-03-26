package Clases;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.util.Date;

/**
 *
 * @author david
 */
public class VentasDao {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    
     public int IdVenta(){
        int id = 0;
        String sql = "SELECT MAX(idVenta) FROM controlarVenta.venta";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return id;
    }
  
        public boolean RegistrarVenta(Ventas ven){
        String sql = "INSERT INTO controlarVenta.venta (fecha, idCliente, idUsuario, sucursId, total, subtotal) VALUES (?,?,?,?,?,?)";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setDate(1, (Date) ven.getFecha());
            ps.setString(2, ven.getIdCliente());            
            ps.setInt(3, ven.getIdUsuario());
            ps.setInt(4, ven.getSucursid());
            ps.setDouble(5, ven.getTotal());
            ps.setDouble(6, ven.getSubtotal());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
        public boolean RegistrarDven(DetalleVentas dven){
        String sql = "INSERT INTO controlarVenta.detalleVenta (ventId, productoId, cantidad, precioProd) VALUES (?,?,?,?)";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1, dven.getVentId());
            ps.setString(2, dven.getProductoId());
            ps.setInt(3, dven.getCantidad());
            ps.setDouble(4, dven.getPrecioProd());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
        
       public boolean ActualizarStock(int cant, String id){
        String sql = "UPDATE controlarInven.producto SET stock = ? WHERE idProd = ?";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1,cant);
            ps.setString(2, id);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }    
}
