package com.mpm.matriculacion.services;

import java.util.List;

import com.mpm.matriculacion.models.Asignatura;

public interface AsignaturaService {
    public List<Asignatura> findAll();
    public Asignatura findById(int id);
    public Asignatura save(Asignatura asignatura);
    public void update(Asignatura asignatura, int id);
    public void deleteById(int id);
    public void deleteAll();
}
