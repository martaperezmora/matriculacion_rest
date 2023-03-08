package com.mpm.matriculacion.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Asignatura {

    @Id
    private int codigo;
    private String descripcion;

    public Asignatura(int codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public Asignatura(int codigo) {
        this.codigo = codigo;
    }

    public Asignatura() {
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
