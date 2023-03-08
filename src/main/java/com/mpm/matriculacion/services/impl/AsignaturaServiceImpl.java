package com.mpm.matriculacion.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.mpm.matriculacion.models.Asignatura;
import com.mpm.matriculacion.repository.AsignaturaRepository;
import com.mpm.matriculacion.services.AsignaturaService;



public class AsignaturaServiceImpl implements AsignaturaService{

    @Autowired
    AsignaturaRepository asignaturaRepository;

    @Override
    public List<Asignatura> findAll() {
        return asignaturaRepository.findAll();
    }

    @Override
    public Asignatura findById(int id) {
        Optional<Asignatura> findById = asignaturaRepository.findById(id);
        if(findById != null){
            return findById.get();
        }
        return null;
    }

    @Override
    public Asignatura save(Asignatura asignatura) {
        return asignaturaRepository.save(asignatura);
    }

    @Override
    public void update(Asignatura asignatura, int id) {
        this.findById(id);
        asignatura.setCodigo(id);
        asignaturaRepository.save(asignatura);
    }

    @Override
    public void deleteById(int id) {
        asignaturaRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        asignaturaRepository.deleteAll();
    }
    
}
