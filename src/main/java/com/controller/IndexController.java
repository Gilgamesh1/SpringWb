/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 *
 * @author Raúl
 */
@Controller
public class IndexController {

    @ModelAttribute("Nombre")
    public String NombreData() {
        return "Carlos";
    }

    @ModelAttribute("Apellido")
    public String ApellidoData() {
        return "Mollapaza";
    }

    @GetMapping("/")
    public String IndexGET(ModelMap Model) {
        return "index/index";
    }
}
