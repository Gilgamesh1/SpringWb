/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.dto.Profesor;
import com.dto.ProfesorValidator;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 *
 * @author Raúl
 */
@Controller
@RequestMapping("/validacion")
public class ValidacionController {

    @Autowired
    private ProfesorValidator validator;

    @GetMapping("/cargar")
    public String cargar(ModelMap Model) {
        return "alumnos/validacion";
    }

    @PostMapping("/guardar")
    public String guardarPost(RedirectAttributes redirect, ModelMap model, @Valid Profesor dto, BindingResult result) {
        System.out.println(" @PostMapping(\"/guardar\")");
        if (result.hasErrors()) {
            System.out.println("Hay Errores");
            model.addAttribute("dto", dto);
            model.addAttribute("result", result);
            return "alumnos/validacion";
        } else {
            System.out.println("No Hay Errores");
            redirect.addAttribute("success", true);
            return "redirect:/validacion/cargar";
        }
    }

    @GetMapping("/cargarValidation")
    public String cargarValidation(ModelMap Model) {
        return "alumnos/customValidation";
    }

    @PostMapping("/validate")
    public String validatePost(RedirectAttributes redirect, ModelMap model, Profesor dto, BindingResult result) {
        System.out.println(" @PostMapping(\"/validatePost\")");
        validator.validate(dto, result);
        if (result.hasErrors()) {
            System.out.println("Hay Errores");
            model.addAttribute("dto", dto);
            model.addAttribute("result", result);
            return "alumnos/customValidation";
        } else {
            System.out.println("No Hay Errores");
            redirect.addAttribute("success", true);
            return "redirect:/validacion/cargarValidation";
        }
    }
}
