/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dto;

import javax.validation.constraints.Email;

/**
 *
 * @author Raúl
 */
public class Profesor extends Persona {

    @Email(message = "Debe de ingrsar un email valido")
    private String email;

    public Profesor() {
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

    @Override
    public String toString() {
        return "Profesor{" + "email=" + email + '}';
    }

}
