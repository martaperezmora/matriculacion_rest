package com.mpm.matriculacion.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.mpm.matriculacion.models.Alumno;
import com.mpm.matriculacion.repository.AlumnoRepository;
import com.mpm.matriculacion.services.AlumnoService;

public class AlumnoServiceImpl implements AlumnoService{

    @Autowired
    AlumnoRepository alumnoRepository;

    @Override
    public List<Alumno> findAll() {
        return alumnoRepository.findAll();
    }

    @Override
    public Alumno findById(int id) {
        Optional<Alumno> findById = alumnoRepository.findById(id);
        if(findById != null){
            return findById.get();
        }
        return null;
    }

    @Override
    public Alumno save(Alumno alumno) {
        return alumnoRepository.save(alumno);
    }

    @Override
    public void update(Alumno alumno, int id) {
        this.findById(id);
        alumno.setCodigo(id);
        alumnoRepository.save(alumno);
    }

    @Override
    public void deleteById(int id) {
        alumnoRepository.deleteById(id);
    }

    @Override
    public void deleteAll() {
        alumnoRepository.deleteAll();
    }
    
}
