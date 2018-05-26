/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 *
 * @author Raúl
 */
public class Persona {

    private int id;
    @NotEmpty(message = "Ingrese el nombre de la persona")
    private String nombre;
    @NotEmpty(message = "Ingrese el apellido materno de la persona")
    private String apeMat;
    @NotEmpty(message = "Ingrese el apellido paterno de la persona")
    private String apePat;
    private int idGenero;
    @NotNull(message = "Debe de ingresar la edad")
    private int edad;

    public Persona() {
        this.edad=0;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apeMat
     */
    public String getApeMat() {
        return apeMat;
    }

    /**
     * @param apeMat the apeMat to set
     */
    public void setApeMat(String apeMat) {
        this.apeMat = apeMat;
    }

    /**
     * @return the apePat
     */
    public String getApePat() {
        return apePat;
    }

    /**
     * @param apePat the apePat to set
     */
    public void setApePat(String apePat) {
        this.apePat = apePat;
    }

    /**
     * @return the idGenero
     */
    public int getIdGenero() {
        return idGenero;
    }

    /**
     * @param idGenero the idGenero to set
     */
    public void setIdGenero(int idGenero) {
        this.idGenero = idGenero;
    }

    /**
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", nombre=" + nombre + ", apeMat=" + apeMat + ", apePat=" + apePat + ", idGenero=" + idGenero + ", edad=" + edad + '}';
    }
}
