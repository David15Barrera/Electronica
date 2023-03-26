package Clases;

import java.util.Date;

/**
 *
 * @author david
 */
public class Ventas {
    private int idVenta;
    private Date fecha;
    private String idCliente;
    private int idUsuario;
    private int sucursid;
    private Double total;
    private Double subtotal;
    
    public Ventas(){
        
    }
    
    public Ventas(int idVenta, Date fecha, String idCliente, int idUsuario, int sucursid, Double total, Double subtotal) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.idCliente = idCliente;
        this.idUsuario = idUsuario;
        this.sucursid = sucursid;
        this.total = total;
        this.subtotal = subtotal;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getSucursid() {
        return sucursid;
    }

    public void setSucursid(int sucursid) {
        this.sucursid = sucursid;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    
    
}
