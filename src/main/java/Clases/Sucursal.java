package Clases;

/**
 *
 * @author david
 */
public class Sucursal {
    private int idSucur;
    private String ubicacion;
    private String direccion;
    private int telefono;
    private String descripcion;

    public Sucursal(){
    
    }
    
    public Sucursal(int idSucur, String ubicacion, String direccion, int telefono, String descripcion) {
        this.idSucur = idSucur;
        this.ubicacion = ubicacion;
        this.direccion = direccion;
        this.telefono = telefono;
        this.descripcion = descripcion;
    }

    public int getIdSucur() {
        return idSucur;
    }

    public void setIdSucur(int idSucur) {
        this.idSucur = idSucur;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
}
