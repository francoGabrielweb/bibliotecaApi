package com.app.web.servicio;

import com.app.web.entidades.Libro;

import java.util.List;

public interface LibroServicio {


    public List<Libro> listarTodosLosLibro();

    public Libro guardarEstudiante(Libro libro);

    public Libro obtenerEstudiantePorId(Long id);

    public Libro actualizarEstudiante(Libro libro);

    public void eliminarEstudiante(Long id);



}
