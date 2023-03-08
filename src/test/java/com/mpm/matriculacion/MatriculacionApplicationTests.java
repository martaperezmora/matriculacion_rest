package com.mpm.matriculacion;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mpm.matriculacion.models.Alumno;
import com.mpm.matriculacion.models.Asignatura;
import com.mpm.matriculacion.repository.AlumnoRepository;
import com.mpm.matriculacion.repository.AsignaturaRepository;

@SpringBootTest
class MatriculacionApplicationTests {

	@Autowired
	AlumnoRepository repoAlumno;

	@Autowired
	AsignaturaRepository repoAsignatura;

	@Test
	void crearalumnosTest() {

		Alumno u1 = new Alumno("alumno1", "apellidos1", "alumno1@email.com", new Date("12/12/2002"),
				"65656565");

		Asignatura a1 = new Asignatura();
		a1.setCodigo("MAT");
		a1.setDescripcion("Matemáticas");
		repoAsignatura.save(a1);

		Asignatura a2 = new Asignatura();
		a2.setCodigo("LEN");
		a2.setDescripcion("Lengua");
		repoAsignatura.save(a2);

		Asignatura a3 = new Asignatura();
		a3.setCodigo("ING");
		a3.setDescripcion("Inglés");
		repoAsignatura.save(a3);

		Asignatura a4 = new Asignatura();
		a4.setCodigo("REL");
		a4.setDescripcion("Religión");
		repoAsignatura.save(a4);

		Asignatura a5 = new Asignatura();
		a5.setCodigo("FIS");
		a5.setDescripcion("Física");
		repoAsignatura.save(a5);

		Asignatura a6 = new Asignatura();
		a6.setCodigo("QUI");
		a6.setDescripcion("Química");
		repoAsignatura.save(a6);

		List<Asignatura> asignaturaAlumno1 = new ArrayList<Asignatura>();
		asignaturaAlumno1.add(a1);
		asignaturaAlumno1.add(a2);
		asignaturaAlumno1.add(a3);

		u1.setAsignaturas(asignaturaAlumno1);

		repoAlumno.save(u1);

	}

}
