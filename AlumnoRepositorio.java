package com.example.repositorio;

import java.util.*;
import java.util.Arrays;
import java.util.List;

import com.example.dominio.Alumno;

public class AlumnoRepositorio {
	Alumno[] data = {
		new Alumno("Juan", "Perez", 16),
		new Alumno("Maria", "Castro", 14),
		new Alumno("Ana", "Ruiz", 18),
	};

	Comparator<Integer> comparador = Collections.reverseOrder();
	
	public List<Alumno> listarordepromedio() {
		
		List<Alumno> alumnos=Arrays.asList(data);
		Collections.sort(alumnos , new Comparator<Alumno>() {
			@Override
			public int compare(Alumno p1,Alumno p2) {
				return p1.promedio.compareTo(p2.promedio);
			}
		});
		return alumnos;
	}
	public List<Alumno> listarNombre() {
		List<Alumno> alumnos=Arrays.asList(data);
		Collections.sort(alumnos , new Comparator<Alumno>() {
			@Override
			public int compare(Alumno p1,Alumno p2) {
				return p1.nombres.compareTo(p2.nombres);
			}
		});
		return alumnos;
	}
	public List<Alumno> listarApellidos() {
		List<Alumno> alumnos=Arrays.asList(data);
		Collections.sort(alumnos , new Comparator<Alumno>() {
			@Override
			public int compare(Alumno p1,Alumno p2) {
				return p1.apellidoPaterno.compareTo(p2.apellidoPaterno);
			}
		});
		return alumnos;
	}
	
	
	public List<Alumno> listar() {
		return Arrays.asList(data);
	}
}
