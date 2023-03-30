package Clases;

import java.sql.Date;

/**
 *
 * @author david
 */
public class Solicitud {
    private int soliId;
    private int soliSucuId;
    private int soliCant;
    private int soliSucuOrigen;
    private String soliProd;
    private Date soliFecha;
    private String estado;
    

    public Solicitud(){
        
    }
    
    public Solicitud(int soliId, int soliSucuId, int soliCant, int soliSucuOrigen, String soliProd, Date soliFecha, String estado) {
        this.soliId = soliId;
        this.soliSucuId = soliSucuId;
        this.soliCant = soliCant;
        this.soliSucuOrigen = soliSucuOrigen;
        this.soliProd = soliProd;
        this.soliFecha = soliFecha;
        this.estado = estado;
    }

    public int getSoliSucuOrigen() {
        return soliSucuOrigen;
    }

    public void setSoliSucuOrigen(int soliSucuOrigen) {
        this.soliSucuOrigen = soliSucuOrigen;
    }

    public int getSoliId() {
        return soliId;
    }

    public void setSoliId(int soliId) {
        this.soliId = soliId;
    }

    public int getSoliSucuId() {
        return soliSucuId;
    }

    public void setSoliSucuId(int soliSucuId) {
        this.soliSucuId = soliSucuId;
    }

    public int getSoliCant() {
        return soliCant;
    }

    public void setSoliCant(int soliCant) {
        this.soliCant = soliCant;
    }

    public String getSoliProd() {
        return soliProd;
    }

    public void setSoliProd(String soliProd) {
        this.soliProd = soliProd;
    }

    public Date getSoliFecha() {
        return soliFecha;
    }

    public void setSoliFecha(Date soliFecha) {
        this.soliFecha = soliFecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
