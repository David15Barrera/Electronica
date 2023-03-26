package Clases;

/**
 *
 * @author david
 */
public class DetalleVentas {
    private int idDet;
    private int ventId;
    private String productoId;
    private int cantidad;
    private Double precioProd;
    
    public DetalleVentas(){
        
    }
    
    public DetalleVentas(int idDet, int ventId, String productoId, int cantidad, Double precioProd) {
        this.idDet = idDet;
        this.ventId = ventId;
        this.productoId = productoId;
        this.cantidad = cantidad;
        this.precioProd = precioProd;
    }

    public int getIdDet() {
        return idDet;
    }

    public void setIdDet(int idDet) {
        this.idDet = idDet;
    }

    public int getVentId() {
        return ventId;
    }

    public void setVentId(int ventId) {
        this.ventId = ventId;
    }

    public String getProductoId() {
        return productoId;
    }

    public void setProductoId(String productoId) {
        this.productoId = productoId;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Double getPrecioProd() {
        return precioProd;
    }

    public void setPrecioProd(Double precioProd) {
        this.precioProd = precioProd;
    }
    
    
}
