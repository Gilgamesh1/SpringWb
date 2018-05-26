/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.dto.Curso;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

/**
 *
 * @author Raúl
 */
@Controller
@RequestMapping("/sesion")
@SessionAttributes(value = {"dto"})
public class SessionController {

    @GetMapping("/cargar")
    public String cargar(ModelMap Model) {
        return "alumnos/sesion";
    }

    @PostMapping("/guardar")
    @ModelAttribute("dto")
    public String guardar(Curso dto, Model model) {
        System.out.println(dto);
        return "alumnos/sesion";
    }

    @GetMapping("/obtener")
    @ResponseBody
    public String obtener(@SessionAttribute("user") Curso dto) {
        System.out.println(dto);
        return "Datos Obtenidos " + String.valueOf(dto.getId()) + " " + dto.getDescripcion();
    }

    @GetMapping("/delete")
    @ResponseBody
    public String delete(SessionStatus status) {
        status.setComplete();
        return "Datos Eliminados";
    }
}
