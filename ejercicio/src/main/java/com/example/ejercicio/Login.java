package com.example.ejercicio;

public class Login {
    private long fechaConexion;
    private String nombre;

    public Login(long fechaConexion, String nombre) {
        this.fechaConexion = fechaConexion;
        this.nombre = nombre;
    }

    public long getFechaConexion() {
        return fechaConexion;
    }

    public void setFechaConexion(long fechaConexion) {
        this.fechaConexion = fechaConexion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean logLater(Login usuario){
        if (this.getFechaConexion() <= usuario.getFechaConexion()){
            return false;
        }
        return true;
    }
}
