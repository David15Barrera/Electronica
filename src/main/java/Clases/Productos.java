package Clases;

import java.sql.Date;

/**
 *
 * @author david
 */
public class Productos {
    private String idProd;
    private String nombreProd;
    private String categoria;
    private String descripcion;
    private Double precio;
    private int stock;
    private int sucurorigin;
    private int cantidad;
    private Date fecha;

    
    public Productos(){
        
    }

    public Productos(String idProd, String nombreProd, String categoria, String descripcion, Double precio, int stock, int sucurorigin, int cantidad, Date fecha) {
        this.idProd = idProd;
        this.nombreProd = nombreProd;
        this.categoria = categoria;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.sucurorigin = sucurorigin;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getIdProd() {
        return idProd;
    }

    public void setIdProd(String idProd) {
        this.idProd = idProd;
    }

    public String getNombreProd() {
        return nombreProd;
    }

    public void setNombreProd(String nombreProd) {
        this.nombreProd = nombreProd;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getSucurorigin() {
        return sucurorigin;
    }

    public void setSucurorigin(int sucurorigin) {
        this.sucurorigin = sucurorigin;
    }
    
    
}
