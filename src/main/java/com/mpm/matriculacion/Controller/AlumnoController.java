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



import com.mpm.matriculacion.models.Alumno;
import com.mpm.matriculacion.services.AlumnoService;

@RestController
public class AlumnoController {
    
    @Autowired
    AlumnoService alumnoService;

    @GetMapping("/alumnos")
    public List<Alumno> lista() {
        return alumnoService.findAll();
    }

    @GetMapping("/alumnos/{id}")
    public Alumno findAlumno(@PathVariable int id) {
        return alumnoService.findById(id);
    }

    @DeleteMapping("/alumnos/{id}")
    public void deleteAlumno(@PathVariable int id) {
        alumnoService.deleteById(id);
    }

    @PostMapping(value = "/alumnos")
    public Alumno guardar(@RequestBody Alumno alumno) {
        return alumnoService.save(alumno);
    }

    @PutMapping(value = "/alumnos/{id}")
    public void modificar(@RequestBody Alumno alumno, @PathVariable("id") int id) {
        alumnoService.update(alumno, id);
    }

}
