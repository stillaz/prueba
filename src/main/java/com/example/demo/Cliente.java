package com.example.demo;

public class Cliente{

    private String identificacion;
    private String nombre;
    private String telefono;

    public Cliente(String identificacion, String nombre, String telefono){
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getIdentificacion(){
        return identificacion;
    }

    public void setIdentificacion(String identificacion){
        this.identificacion = identificacion;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getNombre(){
       return nombre;
    }

    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

    public String getTelefono(){
        return telefono;
    }
}