package Clases;

import conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
        String sql = "select nombre, apellido, cargo, contras FROM controlarDatos.usuario WHERE nombre = ?;";
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
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return l;
    }
}
