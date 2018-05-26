/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.dto.Alumno;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Raúl
 */
@Controller
@RequestMapping("/alumno")
public class AlumnoController {

    @GetMapping("/cargar")
    public String cargar(ModelMap Model) {
        return "alumnos/formulario";
    }

    @GetMapping("/guardar")
    public String guardarGet() {
        System.out.println("@GetMapping(\"/guardar\")");
        return "alumnos/formulario";
    }

//    @PostMapping("/guardar")
//    public String guardarPost(ModelMap model,
//            @RequestParam(name = "nombre") String nombre,
//            @RequestParam(name = "apePat", required = false, defaultValue = "Sin apellidos") String apePat,
//            @RequestParam(name = "apeMat") String apeMat) {
//        System.out.println(" @PostMapping(\"/guardar\")");
//        String fullname = nombre + " " + apePat + " " + apeMat;
//        model.addAttribute("fullname", fullname);
//        System.out.println("fullname: " + fullname);
//        return "alumnos/formulario";
//    }
    @PostMapping("/guardar")
    public String guardarPost(ModelMap model,
            @ModelAttribute("datos") Alumno dto//tambien se puede evitar colocar el @ModelAttribute("datos") ya que spring lo reconocerá
    ) {
        System.out.println(" @PostMapping(\"/guardar\")");
        String fullname = dto.getNombre() + " " + dto.getApePat() + " " + dto.getApeMat()
                + " " + dto.getFehaIngreso() + " " + dto.getEmail() + " " + dto.getIdGenero()
                + " " + dto.getIdNivel() + " " + dto.getCursos() + " " + dto.getUsuario();
        model.addAttribute("fullname", fullname);
        System.out.println("dto: " + dto);
        return "alumnos/formulario";
    }

    @GetMapping("/buscar/{DesNom}/{ApePat}")
    @ResponseBody
    public String BuscarGET(@PathVariable String DesNom, @PathVariable String ApePat) {
        return "Buscar " + DesNom + " Paterno " + ApePat;
    }

    @GetMapping("/lista")
    public String ListaGET(ModelMap Model) {
        List<String> NombreList = Arrays.asList("Carlos", "Adan", "Dani", "Jose");
        Model.addAttribute("NombreList", NombreList);
        return "alumnos/list";
    }

}
