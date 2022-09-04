package com.portafolio.RestService.Model;


import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "USUARIO")
public class Usuario {

    @Id
    @Column(name = "RUT")
    String rut;
    @Column(name = "NOMBRE")
    String nombre;
    @Column(name = "APELLIDO_PATERNO")
    String apellidoPaterno;
    @Column(name = "APELLIDO_MATERNO")
    String apellidoMaterno;
    @Column(name = "TELEFONO")
    String telefono;
    @Column(name = "EMAIL")
    String email;
    @Column(name = "CLAVE")
    String clave;
    @Column(name = "CONTRATO_ID")
    int contratoID;
    @Column(name = "ROL_ID")
    int rolID;

    public Usuario() {
    }

    public Usuario(String rut, String nombre, String apellidoPaterno, String apellidoMaterno, String telefono, String email, String clave, int contratoID, int rolID) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.telefono = telefono;
        this.email = email;
        this.clave = clave;
        this.contratoID = contratoID;
        this.rolID = rolID;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getContratoID() {
        return contratoID;
    }

    public void setContratoID(int contratoID) {
        this.contratoID = contratoID;
    }

    public int getRolID() {
        return rolID;
    }

    public void setRolID(int rolID) {
        this.rolID = rolID;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "rut='" + rut + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", apellidoMaterno='" + apellidoMaterno + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", clave='" + clave + '\'' +
                ", contratoID=" + contratoID +
                ", rolID=" + rolID +
                '}';
    }
}
