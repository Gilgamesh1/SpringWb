/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dao.impl;

import com.dao.IAlumnoDao;
import com.dto.Alumno;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Raúl
 */
@Repository
public class AlumnoDao implements IAlumnoDao {

    @PersistenceContext
    private EntityManager IEntityManager;

    @Override
    public void Save(Alumno Entity) {
        IEntityManager.persist(Entity);
    }

    @Override
    public void Update(Alumno Entity) {
        IEntityManager.merge(Entity);
    }

    @Override
    public void Delete(Alumno Entity) {
        IEntityManager.remove(Entity);
    }

    @Override
    public Alumno GetById(Integer Id) {
        return IEntityManager.find(Alumno.class, Id);
    }

    @Override
    public List<Alumno> GetAll() {
        return IEntityManager.createQuery("FROM Alumno").getResultList();
    }

}
