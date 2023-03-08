package com.mpm.matriculacion.models;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Asignatura {

    @Id
    @GeneratedValue
    private int id;

    @Column(length = 3)
    private String codigo;
    private String descripcion;

    //@ManyToMany(mappedBy = "asignaturas")
    private List<Alumno> alumnos;

    public Asignatura(int id, String codigo, String descripcion, List<Alumno> alumnos) {
        this.id = id;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.alumnos = alumnos;
    }

    public Asignatura(String codigo, String descripcion, List<Alumno> alumnos) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.alumnos = alumnos;
    }

    public Asignatura() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
/*
    public List<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(List<Alumno> alumnos) {
        this.alumnos = alumnos;
    }
*/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
