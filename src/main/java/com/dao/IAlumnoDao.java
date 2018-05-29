/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao;

import com.dto.Alumno;
import java.util.List;

/**
 *
 * @author Raúl
 */
public interface IAlumnoDao {

    void Save(Alumno Entity);

    void Update(Alumno Entity);

    void Delete(Alumno Entity);

    Alumno GetById(Integer Id);

    List<Alumno> GetAll();

}
