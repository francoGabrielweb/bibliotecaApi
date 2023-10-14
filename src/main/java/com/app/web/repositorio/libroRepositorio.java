package com.app.web.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.app.web.entidades.Libro;

@Repository
public interface libroRepositorio extends JpaRepository<Libro , Long> {






}
