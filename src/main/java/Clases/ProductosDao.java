package Clases;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.Date;
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

//Metodo para Enlizar los productos    
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
   
//Metodo para Registrar los productos
  public boolean RegistrarInv(Productos dven){
        String sql = "INSERT INTO controlarInven.inventario (prodid, cantidad, fechaingreso, sucurid) VALUES (?,?,?,?)";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, dven.getIdProd());
            ps.setInt(2, dven.getCantidad());
            ps.setDate(3, dven.getFecha());
            ps.setInt(4, dven.getSucurorigin());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
  
  //Metodo para Enlizar los productos en una tienda en especifico
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

//Metodo para buscar un producto por medio del ID      
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

//Metodo para buscar un producto por su ID y por la sucursal donde proviene
      public Productos BuscarProd(String codProd,int sucu){
        Productos pro = new Productos();
        String sql = "select * from controlarInven.inventario WHERE prodid = ? AND sucurid=?";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, codProd);
            ps.setInt(2, sucu);
            rs = ps.executeQuery();
            if (rs.next()) {
               pro.setIdProd(rs.getString("prodid"));
               pro.setCantidad(rs.getInt("cantidad"));
               pro.setFecha(rs.getDate("fechaingreso"));
               pro.setSucurorigin(rs.getInt("sucurid"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return pro;
    }
    
//Metodo para seleccionar todos los valores en inventario por medio de su id
      public Productos BuscarPInv(String codProd){
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
               pro.setFecha(rs.getDate("fechaingreso"));
               pro.setSucurorigin(rs.getInt("sucurid"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return pro;
    }
          
//Metodo para listar la categoria
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
    
//Metodo para listar el id de la sucursal origen    
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
     
//Metodo para listar las categorias de los productos por medio de los prod
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
    
//Metodo para rgistrar un producto
     public boolean RegistrarProductos(Productos reg){
        String sql = "INSERT INTO controlarInven.producto (idProd, nombre, categoria, descripcion, precio, stock) VALUES(?,?,?,?,?,?);";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, reg.getIdProd());
            ps.setString(2, reg.getNombreProd());
            ps.setString(3, reg.getCategoria());
            ps.setString(4, reg.getDescripcion());
            ps.setDouble(5, reg.getPrecio());
            ps.setInt(6, reg.getStock());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }  
    
//Metodo para poder modificar un producto
     public boolean ModificarProducto(Productos pro){
       String sql = "UPDATE controlarInven.producto SET nombre = ?, categoria = ?, descripcion = ?, precio = ?, stock = ? WHERE idProd = ?;";
       try {
           con = cn.conectar();
           ps = con.prepareStatement(sql);
           ps.setString(1, pro.getNombreProd());
           ps.setString(2, pro.getCategoria());
           ps.setString(3, pro.getDescripcion());
           ps.setDouble(4, pro.getPrecio());
           ps.setInt(5, pro.getStock());
           ps.setString(6, pro.getIdProd());
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
     
//Metodo para modificar los valores en inventario
     public boolean ModificarProdInv(Productos pro){
       String sql = "UPDATE controlarInven.inventario SET sucurId = ?, prodId = ?, cantidad = ?, fechaIngreso = ? WHERE prodId = ? AND sucurId=?;";
       try {
           con = cn.conectar();
           ps = con.prepareStatement(sql);
           ps.setInt(1, pro.getSucurorigin());
           ps.setString(2, pro.getIdProd());
           ps.setInt(3, pro.getCantidad());
           ps.setDate(4, pro.getFecha());
           ps.setString(5, pro.getIdProd());
           ps.setInt(6, pro.getSucurorigin());
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
       
//Metodo para buscar si un producto ya existe
     public Productos BuscarProdExis(String codProd){
        Productos pro = new Productos();
        String sql = "SELECT COUNT(*) AS existe_producto FROM controlarInven.producto WHERE idProd = ?;";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, codProd);
            rs = ps.executeQuery();
            if (rs.next()) {
               pro.setCantidad(rs.getInt("existe_producto"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return pro;
    }      

//Metodo para buscar un producto     
     public List BuscProd(String prod){
        List<Productos> ListaProd = new ArrayList();    
                String sql = "SELECT * FROM controlarInven.producto WHERE idProd LIKE ? OR nombre LIKE ? OR categoria LIKE ?;";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + prod + "%");
            ps.setString(2, "%" + prod + "%");
            ps.setString(3, "%" + prod + "%");
            rs = ps.executeQuery();
  
            while (rs.next()) {
               Productos pro = new Productos();
               pro.setIdProd(rs.getString("idProd"));
               pro.setNombreProd(rs.getString("nombre"));
               pro.setCategoria(rs.getString("categoria"));
               pro.setDescripcion(rs.getString("descripcion"));
               pro.setPrecio(rs.getDouble("precio"));
               pro.setStock(rs.getInt("stock"));
               ListaProd.add(pro);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return ListaProd;
    }

//metodo para actualizar el Stock de ventas en bodega
     public boolean ActualizarStock(int cant, String id){
        String sql = "UPDATE controlarInven.producto SET stock = ? WHERE idprod = ?";
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
       
//metodo para buscar un producto por su cargo y si numero sucursal
     public List BusProdVen(String user, int sucu){
        List<Productos> ListaUser = new ArrayList();    
                String sql = "SELECT p.idProd, p.nombre, p.categoria, p.precio, p.descripcion, i.cantidad FROM controlarInven.producto p INNER JOIN controlarInven.inventario i ON p.idProd = i.prodId WHERE (p.idProd = ? OR p.nombre LIKE ? OR p.categoria LIKE ?) AND i.sucurId = ?;";
        try {
            con = cn.conectar();
            ps = con.prepareStatement(sql);
            ps.setString(1, "%" + user + "%");
            ps.setString(2, "%" + user + "%");
            ps.setString(3, "%" + user + "%");
            ps.setInt(4, sucu);
            rs = ps.executeQuery();
  
            while (rs.next()) {
               Productos lg = new Productos();
               lg.setIdProd(rs.getString("idProd"));
               lg.setNombreProd(rs.getString("nombre"));
               lg.setCategoria(rs.getString("categoria"));
               lg.setPrecio(rs.getDouble("precio"));
               lg.setDescripcion(rs.getString("descripcion"));
               lg.setCantidad(rs.getInt("cantidad"));
               ListaUser.add(lg);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return ListaUser;
    }    
}
