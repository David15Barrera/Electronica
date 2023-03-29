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
public class ReportesDao {
     Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
//Metodo para listar una venta con los datos de sus nombres y apellidos en vez de numeros o codigos    
        public List ListRVent(){
       List<Ventas> Lista = new ArrayList();
       String sql = "SELECT u.nombre AS nombre_usuario, u.apellido AS apellido_usuario, c.nombre AS nombre_cliente, c.apellido AS apellido_cliente, s.Ubicacion AS ubicacion_sucursal, v.total, v.subtotal, v.fecha, v.idVenta FROM controlarDatos.usuario u JOIN controlarVenta.venta v ON u.idUser = v.idUsuario JOIN controlarDatos.cliente c ON v.idCliente = c.dpi JOIN controlarDatos.sucursal s ON v.sucursId = s.idSucur;";
       try {
           con = cn.conectar();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Ventas sal = new Ventas();
               sal.setNomUser(rs.getString("nombre_usuario"));
               sal.setApeUser(rs.getString("apellido_usuario"));
               sal.setNomClie(rs.getString("nombre_cliente"));
               sal.setApelClie(rs.getString("apellido_cliente"));
               sal.setUbiSucur(rs.getString("ubicacion_sucursal"));
               sal.setTotal(rs.getDouble("total"));
               sal.setSubtotal(rs.getDouble("subtotal"));
               sal.setFecha(rs.getDate("fecha"));
               sal.setIdVenta(rs.getInt("idventa"));
               Lista.add(sal);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return Lista;
   }
//Top 10 productos más vendiso            
     public List LisTenProd(){
       List<Ventas> Lista = new ArrayList();
       String sql = "SELECT p.idProd, p.nombre, SUM(dv.cantidad) AS cantidad_vendida FROM controlarVenta.detalleVenta dv INNER JOIN controlarInven.producto p ON dv.productoId = p.idProd GROUP BY p.idProd, p.nombre ORDER BY cantidad_vendida DESC LIMIT 10;";
       try {
           con = cn.conectar();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Ventas sal = new Ventas();
               sal.setNomUser(rs.getString("idprod"));
               sal.setApeUser(rs.getString("nombre"));
               sal.setTotal(rs.getDouble("cantidad_vendida"));
               Lista.add(sal);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return Lista;
   }
//Top 10 productos más ingresos            
     public List LisTenProdMas(){
       List<Ventas> Lista = new ArrayList();
       String sql = "SELECT p.idProd, p.nombre, SUM(dv.cantidad*dv.precioProd) as ingresos FROM controlarVenta.detalleVenta dv INNER JOIN controlarInven.producto p ON dv.productoId = p.idProd GROUP BY p.idProd, p.nombre ORDER BY ingresos DESC LIMIT 10;";
       try {
           con = cn.conectar();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Ventas sal = new Ventas();
               sal.setNomUser(rs.getString("idprod"));
               sal.setApeUser(rs.getString("nombre"));
               sal.setTotal(rs.getDouble("ingresos"));
               Lista.add(sal);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return Lista;
   }
//Top 3 suursales más ingresos    
    public List LisTreMas(){
       List<Ventas> Lista = new ArrayList();
       String sql = "SELECT s.idSucur, s.ubicacion, SUM(v.total) as total_ventas FROM controlarDatos.sucursal s JOIN controlarVenta.venta v ON s.idSucur = v.sucursId GROUP BY s.idSucur, s.ubicacion ORDER BY total_ventas DESC LIMIT 3;";
       try {
           con = cn.conectar();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Ventas sal = new Ventas();
               sal.setSucursid(rs.getInt("idSucur"));
               sal.setUbiSucur(rs.getString("ubicacion"));
               sal.setTotal(rs.getDouble("total_ventas"));
               Lista.add(sal);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return Lista;
   }
//Top 3 suursales más cantidad        
    public List LisCanTreMas(){
       List<Ventas> Lista = new ArrayList();
       String sql = "SELECT s.idSucur, s.ubicacion, COUNT(*) as totalVentas FROM controlarDatos.sucursal s JOIN controlarVenta.venta v ON s.idSucur = v.sucursId GROUP BY s.idSucur, s.ubicacion ORDER BY totalVentas DESC LIMIT 3;";
       try {
           con = cn.conectar();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Ventas sal = new Ventas();
               sal.setSucursid(rs.getInt("idSucur"));
               sal.setUbiSucur(rs.getString("ubicacion"));
               sal.setTotal(rs.getDouble("totalVentas"));
               Lista.add(sal);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return Lista;
   }
//Top 3 empleados más impote    
       public List LisImEmp(){
       List<Ventas> Lista = new ArrayList();
       String sql = "SELECT u.userdpi, u.nombre, u.apellido, SUM(v.total) AS ventas_totales, s.idSucur, s.ubicacion FROM controlarDatos.usuario u JOIN controlarVenta.venta v ON u.idUser = v.idUsuario JOIN controlarDatos.sucursal s ON u.sucurIdUser = s.idSucur GROUP BY u.userdpi, u.nombre, u.apellido, s.idSucur, s.ubicacion ORDER BY ventas_totales DESC LIMIT 3;";
       try {
           con = cn.conectar();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Ventas sal = new Ventas();
               sal.setDpiUser(rs.getString("userdpi"));
               sal.setNomUser(rs.getString("nombre"));
               sal.setApeUser(rs.getString("apellido"));
               sal.setTotal(rs.getDouble("ventas_totales"));
               sal.setUbiSucur(rs.getString("ubicacion"));
               sal.setSucursid(rs.getInt("idSucur"));
               Lista.add(sal);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return Lista;
   } 
//Top 3 empleados más cantidad de ventas    
       public List LisCantEmp(){
       List<Ventas> Lista = new ArrayList();
       String sql = "SELECT u.userdpi, u.nombre, u.apellido, s.ubicacion, COUNT(*) AS cantidad_ventas FROM controlarVenta.venta v INNER JOIN controlarDatos.usuario u ON v.idUsuario = u.idUser INNER JOIN controlarDatos.sucursal s ON u.sucurIdUser = s.idSucur GROUP BY u.userdpi, u.nombre, u.apellido, s.ubicacion ORDER BY cantidad_ventas DESC LIMIT 3;";
       try {
           con = cn.conectar();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Ventas sal = new Ventas();
               sal.setDpiUser(rs.getString("userdpi"));
               sal.setNomUser(rs.getString("nombre"));
               sal.setApeUser(rs.getString("apellido"));
               sal.setTotal(rs.getDouble("cantidad_ventas"));
               sal.setUbiSucur(rs.getString("ubicacion"));
               Lista.add(sal);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return Lista;
   } 
 //Top 3 sucursales con más cantidad de productos vendidos      
   public List LisCantCon(){
       List<Ventas> Lista = new ArrayList();
       String sql = "SELECT s.idSucur, s.ubicacion, p.idProd, p.nombre AS producto, SUM(dv.cantidad) AS total_vendido FROM controlarDatos.sucursal s INNER JOIN controlarVenta.venta v ON s.idSucur = v.sucursId INNER JOIN controlarVenta.detalleVenta dv ON v.idVenta = dv.ventId INNER JOIN controlarInven.producto p ON dv.productoId = p.idProd GROUP BY s.idSucur, p.idProd ORDER BY s.idSucur, total_vendido DESC LIMIT 5;";
       try {
           con = cn.conectar();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Ventas sal = new Ventas();
               sal.setSucursid(rs.getInt("idSucur"));
               sal.setUbiSucur(rs.getString("ubicacion"));
               sal.setDpiUser(rs.getString("idProd"));
               sal.setNomUser(rs.getString("producto"));
               sal.setTotal(rs.getDouble("total_vendido"));                
               Lista.add(sal);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return Lista;
   } 
 //Top 3 sucursales con más ingresos de productos vendidos   
    public List LisIngreCon(){
       List<Ventas> Lista = new ArrayList();
       String sql = "SELECT s.ubicacion, p.idProd, p.nombre, SUM(dv.cantidad*dv.precioProd) as ingresos FROM controlarInven.producto p JOIN controlarVenta.detalleVenta dv ON p.idProd = dv.productoId JOIN controlarVenta.venta v ON dv.ventId = v.idVenta JOIN controlarDatos.sucursal s ON v.sucursId = s.idSucur GROUP BY s.ubicacion, p.idProd, p.nombre ORDER BY s.ubicacion, ingresos DESC LIMIT 5;";
       try {
           con = cn.conectar();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Ventas sal = new Ventas();
               sal.setUbiSucur(rs.getString("ubicacion"));
               sal.setDpiUser(rs.getString("idProd"));
               sal.setNomUser(rs.getString("nombre"));
               sal.setTotal(rs.getDouble("ingresos"));                
               Lista.add(sal);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return Lista;
   }

 //Top 10 clientes mas ganancias    
       public List LisCliente(){
       List<Ventas> Lista = new ArrayList();
       String sql = "SELECT c.dpi, c.nombre, c.apellido, SUM(v.total) AS ganancias FROM controlarDatos.cliente c JOIN controlarVenta.venta v ON c.dpi = v.idCliente GROUP BY c.dpi ORDER BY ganancias DESC LIMIT 10;";
       try {
           con = cn.conectar();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Ventas sal = new Ventas();
               sal.setDpiUser(rs.getString("dpi"));
               sal.setNomClie(rs.getString("nombre"));
               sal.setApelClie(rs.getString("apellido"));
               sal.setTotal(rs.getDouble("ganancias"));                
               Lista.add(sal);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return Lista;
   } 
}
