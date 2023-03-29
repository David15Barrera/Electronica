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
 //Para selecionar la ultima venta ingresada en ventas   
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
//Metodo para selecionar el total más reciente de un cliente en especifico
     public Ventas idSubVenta(String nuevo){
      Ventas cli = new Ventas();
        String sql = "SELECT subTotal FROM ( SELECT subTotal, ROW_NUMBER() OVER (PARTITION BY idCliente ORDER BY fecha DESC) AS row_num FROM controlarVenta.venta WHERE idCliente = ?) AS venta_num WHERE row_num = 1;";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, nuevo);
            rs = ps.executeQuery();
            if (rs.next()) {
                cli.setSubtotal(rs.getDouble("subtotal"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return cli;
    } 
    
//Registrar ventas   
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
//Registraer el detalle de las ventas
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
//Actualizar el stok en el inventario        
       public boolean ActualizarStock(int cant, String id, int sucu){
        String sql = "UPDATE controlarInven.inventario SET cantidad = ? WHERE prodid = ? AND sucurid=?";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setInt(1,cant);
            ps.setString(2, id);
            ps.setInt(3, sucu);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
//Buscar un cliente por su dpi
   public Ventas BuscarClieVen(String dpi){
    Ventas cli = new Ventas();
    String sql = "select idcliente FROM controlarVenta.venta where idcliente = ? GROUP BY idcliente;";
      try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, dpi);
            rs = ps.executeQuery();
            if (rs.next()) {
                cli.setIdCliente(rs.getString("idcliente"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return cli;
    } 
}
