package com.example.tareafinal3;

public class Usuarios {
    private int id;
    private String Cedula;
    private String Nombre;
    private String Apellido;
    private String Correo;
    private String Direccion;
    private String Imagen;
public Usuarios(){
    }
    public Usuarios(String Cedula,String Nombre,String Apellido,String Direccion, String Correo,String Imagen){
    this.Cedula=Cedula;
    this.Nombre=Nombre;
    this.Apellido=Apellido;
    this.Direccion=Direccion;
    this.Correo=Correo;
    this.Imagen=Imagen;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String cedula) {
        Cedula = cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String correo) {
        Correo = correo;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }


    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String imagen) {
        Imagen = imagen;
    }
}
