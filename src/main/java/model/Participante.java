package model;

public class Participante {

    String nombre;
    String apellido;
    String cedula;
    String direccion;
    TipoAfiliacion afiliacion;

    public Participante() {
    }

    public Participante(String nombre, String apellido, String cedula, String direccion, TipoAfiliacion afiliacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.direccion = direccion;
        this.afiliacion = afiliacion;
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

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public TipoAfiliacion getAfiliacion() {
        return afiliacion;
    }

    public void setAfiliacion(TipoAfiliacion afiliacion) {
        this.afiliacion = afiliacion;
    }

}
