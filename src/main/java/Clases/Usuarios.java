package Clases;

/**
 *
 * @author david
 */
public class Usuarios {
    private String idUser;
    private String nombre;
    private String apellido;
    private String direccion;
    private int telefono;
    private String cargo;
    private String contras;
    private int Sucuriduser;
    private String dpiUser;

    public Usuarios(){
        
    }
    public Usuarios(String idUser, String nombre, String apellido, String direccion, int telefono, String cargo, String contras, int Sucuriduser, String dpiUser) {
        this.idUser = idUser;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.telefono = telefono;
        this.cargo = cargo;
        this.contras = contras;
        this.Sucuriduser = Sucuriduser;
        this.dpiUser = dpiUser;
    }

    public String getDpiUser() {
        return dpiUser;
    }

    public void setDpiUser(String dpiUser) {
        this.dpiUser = dpiUser;
    }

    public int getSucuriduser() {
        return Sucuriduser;
    }

    public void setSucuriduser(int setSucuriduser) {
        this.Sucuriduser = setSucuriduser;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getContras() {
        return contras;
    }

    public void setContras(String contras) {
        this.contras = contras;
    }
    
    
         
}
