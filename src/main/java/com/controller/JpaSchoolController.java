/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.controller;

import com.dao.IAlumnoDao;
import com.dto.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Raúl
 */
@Controller
@RequestMapping("/jpa")
public class JpaSchoolController {

    @Autowired
    private IAlumnoDao AlumnoDao;

    @GetMapping("/cargar")
    public String cargar(ModelMap Model) {
        return "alumnos/JpaSchool";
    }

    @PostMapping("/save")
    @Transactional
    public String SavePOST(Alumno Form) {
        AlumnoDao.Save(Form);
        return "index";
    }
}
