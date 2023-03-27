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
    
  public List ListarProductosCom(){
       List<Productos> Lista = new ArrayList();
       String sql = "select * from controlarInven.producto";
       try {
           con = cn.conectar();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Productos prod = new Productos();
               prod.setIdProd(rs.getString("idProd"));
               prod.setNombreProd(rs.getString("nombre"));
               prod.setCategoria(rs.getString("categoria"));
               prod.setDescripcion(rs.getString("descripcion"));
               prod.setPrecio(rs.getDouble("precio"));
               prod.setStock(rs.getInt("stock"));
               Lista.add(prod);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return Lista;
   }
    
      public List ListarProd(int num){
       List<Productos> Lista = new ArrayList();
       String sql = "SELECT p. idprod, p.nombre, p.descripcion, p.categoria, p.precio, i.cantidad FROM controlarInven.inventario i JOIN controlarInven.producto p ON i.prodId = p.idProd WHERE i.sucurId = ?;";
       try {
           con = cn.conectar();
           ps = con.prepareStatement(sql);
           ps.setInt(1, num);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Productos prod = new Productos();
               prod.setIdProd(rs.getString("idProd"));
               prod.setNombreProd(rs.getString("nombre"));
               prod.setDescripcion(rs.getString("descripcion"));
               prod.setCategoria(rs.getString("categoria"));
               prod.setPrecio(rs.getDouble("precio"));
               prod.setCantidad(rs.getInt("cantidad"));
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
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return pro;
    }
      public Productos BuscarProd(String codProd){
        Productos pro = new Productos();
        String sql = "select * from controlarInven.inventario WHERE prodid = ?";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, codProd);
            rs = ps.executeQuery();
            if (rs.next()) {
               pro.setIdProd(rs.getString("prodid"));
               pro.setCantidad(rs.getInt("cantidad"));
               pro.setDescripcion(rs.getString("fechaingreso"));
               pro.setSucurorigin(rs.getInt("sucurid"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return pro;
    }
    
    public List ListarCat(){
       List<Productos> Lista = new ArrayList();
       String sql = "SELECT categoria FROM controlarInven.producto GROUP BY categoria;";
       try {
           con = cn.conectar();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Productos pro = new Productos();
               pro.setCategoria(rs.getString("categoria"));
               Lista.add(pro);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return Lista;
   }
    
     public List ListarIdSur(){
       List<Productos> Lista = new ArrayList();
       String sql = "SELECT sucurorigin FROM controlarInven.producto GROUP BY sucurorigin;";
       try {
           con = cn.conectar();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Productos pro = new Productos();
               pro.setSucurorigin(rs.getInt("sucurorigin"));
               Lista.add(pro);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return Lista;
   }
     
    public List ListarIdProd(){
       List<Productos> Lista = new ArrayList();
       String sql = "SELECT categoria FROM controlarInven.producto;";
       try {
           con = cn.conectar();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Productos pro = new Productos();
               pro.setCategoria(rs.getString("categoria"));
               Lista.add(pro);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return Lista;
   }
}
