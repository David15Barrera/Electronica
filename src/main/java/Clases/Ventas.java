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
   //Datos para la consultas
    private String nomUser;
    private String apeUser;
    private String nomClie;
    private String apelClie;
    private String ubiSucur;
    private String dpiUser;
    
    public Ventas(){
        
    }
    
    public Ventas(int idVenta, Date fecha, String idCliente, int idUsuario, int sucursid, Double total, Double subtotal, String nomUser, String apeUser, String nomClie, String apelClie, String ubiSucur, String dpiUser) {
        this.idVenta = idVenta;
        this.fecha = fecha;
        this.idCliente = idCliente;
        this.idUsuario = idUsuario;
        this.sucursid = sucursid;
        this.total = total;
        this.subtotal = subtotal;
        this.nomUser = nomUser;
        this.apeUser = apeUser;
        this.nomClie = nomClie;
        this.apelClie = apelClie;
        this.ubiSucur = ubiSucur;
        this.dpiUser = dpiUser;
    }

    public String getDpiUser() {
        return dpiUser;
    }

    public void setDpiUser(String dpiUser) {
        this.dpiUser = dpiUser;
    }

    public String getNomUser() {
        return nomUser;
    }

    public void setNomUser(String nomUser) {
        this.nomUser = nomUser;
    }

    public String getApeUser() {
        return apeUser;
    }

    public void setApeUser(String apeUser) {
        this.apeUser = apeUser;
    }

    public String getNomClie() {
        return nomClie;
    }

    public void setNomClie(String nomClie) {
        this.nomClie = nomClie;
    }

    public String getApelClie() {
        return apelClie;
    }

    public void setApelClie(String apelClie) {
        this.apelClie = apelClie;
    }

    public String getUbiSucur() {
        return ubiSucur;
    }

    public void setUbiSucur(String ubiSucur) {
        this.ubiSucur = ubiSucur;
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
