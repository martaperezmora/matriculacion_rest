package com.mpm.matriculacion.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mpm.matriculacion.models.Asignatura;
import com.mpm.matriculacion.services.AsignaturaService;

@RestController
public class AsignaturaController {
    
    @Autowired
    AsignaturaService asignaturaService;

    @GetMapping("/asignaturas")
    public List<Asignatura> lista() {
        return asignaturaService.findAll();
    }

    @GetMapping("/asignaturas/{id}")
    public Asignatura findAsignatura(@PathVariable int id) {
        return asignaturaService.findById(id);
    }

    @DeleteMapping("/asignaturas/{id}")
    public void deleteAsignatura(@PathVariable int id) {
        asignaturaService.deleteById(id);
    }

    @PostMapping(value = "/asignaturas")
    public Asignatura guardar(@RequestBody Asignatura asignatura) {
        return asignaturaService.save(asignatura);
    }

    @PutMapping(value = "/asignaturas/{id}")
    public void modificar(@RequestBody Asignatura asignatura, @PathVariable("id") int id) {
        asignaturaService.update(asignatura, id);
    }

}
