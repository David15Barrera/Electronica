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
    //Para consultas
    private String nomProd;
    private String nomUbi;
    private String nomUbi2;
       

    public Solicitud(){
        
    }
    
    public Solicitud(int soliId, int soliSucuId, int soliCant, int soliSucuOrigen, String soliProd, Date soliFecha, String estado, String nomProd, String nomUbi, String nomUbi2) {
        this.soliId = soliId;
        this.soliSucuId = soliSucuId;
        this.soliCant = soliCant;
        this.soliSucuOrigen = soliSucuOrigen;
        this.soliProd = soliProd;
        this.soliFecha = soliFecha;
        this.estado = estado;
        this.nomProd = nomProd;
        this.nomUbi = nomUbi;
        this.nomUbi2 = nomUbi2;
    }

    public String getNomProd() {
        return nomProd;
    }

    public void setNomProd(String nomProd) {
        this.nomProd = nomProd;
    }

    public String getNomUbi() {
        return nomUbi;
    }

    public void setNomUbi(String nomUbi) {
        this.nomUbi = nomUbi;
    }

    public String getNomUbi2() {
        return nomUbi2;
    }

    public void setNomUbi2(String nomUbi2) {
        this.nomUbi2 = nomUbi2;
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
