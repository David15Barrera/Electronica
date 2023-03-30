package Clases;

import conexion.Conexion;
import java.sql.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author david
 */
public class SolicitudDao {
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Conexion cn = new Conexion();
    
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
}
