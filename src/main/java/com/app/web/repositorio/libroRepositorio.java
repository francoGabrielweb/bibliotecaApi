package com.app.web.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.app.web.entidades.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface libroRepositorio extends JpaRepository<Libro , Long> {






}
