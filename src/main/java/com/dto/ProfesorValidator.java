/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;

/**
 *
 * @author Raúl
 */
@Component
public class ProfesorValidator {
    private static final String EMAIL_REGEX = "^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$";
    // static Pattern object, since pattern is fixed
    private static Pattern pattern;
    // non-static Matcher object because it's created from the input String
    private Matcher matcher;

    public void validate(Object target, Errors error) {
        Profesor formulario = (Profesor) target;
        ValidationUtils.rejectIfEmptyOrWhitespace(error, "edad", "error.edad", "Edad es un campo requerido");
        if (formulario.getApePat() == null || formulario.getApePat().equals("")) {
            error.rejectValue("apePat", "error.apePat", "El apellido paterno es un campo requerido");
        }
        if (formulario.getApeMat() == null || formulario.getApeMat().equals("")) {
            error.rejectValue("apeMat", "error.apePat", "El apellido materno es un campo requerido");
        }
        if (formulario.getNombre() == null || formulario.getNombre().equals("")) {
            error.rejectValue("nombre", "error.apePat", "El nombre es un campo requerido");
        }
        if (formulario.getEmail() == null || formulario.getEmail().equals("")) {
            error.rejectValue("email", "error.email", "El email es requerido");
        }
        // initialize the Pattern object
        pattern = Pattern.compile(EMAIL_REGEX, Pattern.CASE_INSENSITIVE);
        matcher = pattern.matcher(formulario.getEmail());
        if (!matcher.matches()) {
            error.rejectValue("email", "error.email.escritura", "El email esta mal escrito");
        }
    }
}
