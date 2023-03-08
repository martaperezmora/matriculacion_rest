package com.mpm.matriculacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mpm.matriculacion.models.Alumno;



@Repository
public interface AlumnoRepository extends JpaRepository<Alumno, Integer>{
    
}