/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.dto.Alumno;
import java.io.File;
import java.io.IOException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Raúl
 */
@Controller
@RequestMapping("/file")
public class FileUploadController {

    @GetMapping("/cargar")
    public String cargar() {
        return "alumnos/fileUpload";
    }

    @PostMapping("/subirFoto")
    public String subirFoto(ModelMap model, Alumno alumno) throws IOException {
        System.out.println(alumno);
        System.out.println(alumno.getDesFot().getName());
        FileCopyUtils.copy(alumno.getDesFot().getBytes(), new File("D:/z/fotos/" + alumno.getDesFot().getOriginalFilename()));
        model.addAttribute("alumno", alumno);
        return "alumnos/fileUpload";
    }
}
