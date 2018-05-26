/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dto;

import java.util.Date;
import java.util.List;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

/**
 *
 * @author Raúl
 */
public class Alumno extends Persona {

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fehaIngreso;
    private String email;
    private String idNivel;
    private List<Curso> cursos;
    private Usuario usuario;
    private MultipartFile desFot;

    public Alumno() {
    }

    /**
     * @return the fehaIngreso
     */
    public Date getFehaIngreso() {
        return fehaIngreso;
    }

    /**
     * @param fehaIngreso the fehaIngreso to set
     */
    public void setFehaIngreso(Date fehaIngreso) {
        this.fehaIngreso = fehaIngreso;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the idNivel
     */
    public String getIdNivel() {
        return idNivel;
    }

    /**
     * @param idNivel the idNivel to set
     */
    public void setIdNivel(String idNivel) {
        this.idNivel = idNivel;
    }

    /**
     * @return the cursos
     */
    public List<Curso> getCursos() {
        return cursos;
    }

    /**
     * @param cursos the cursos to set
     */
    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the desFot
     */
    public MultipartFile getDesFot() {
        return desFot;
    }

    /**
     * @param desFot the desFot to set
     */
    public void setDesFot(MultipartFile desFot) {
        this.desFot = desFot;
    }

    @Override
    public String toString() {
        return "Alumno{" + "fehaIngreso=" + fehaIngreso + ", email=" + email + ", idNivel=" + idNivel + ", cursos=" + cursos + ", usuario=" + usuario + ", desFot=" + desFot + '}';
    }

}
