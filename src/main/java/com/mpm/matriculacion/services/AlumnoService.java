package com.mpm.matriculacion.services;

import java.util.List;

import com.mpm.matriculacion.models.Alumno;

public interface AlumnoService {
    public List<Alumno> findAll();
    public Alumno findById(int id);
    public Alumno save(Alumno alumno);
    public void update(Alumno alumno, int id);
    public void deleteById(int id);
    public void deleteAll();
}
