package com.app.web.entidades;


import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "libros")
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private   Long  isbn  ;


    @ManyToOne // Puedes necesitar ajustar esto según la relación real
    private Autor autor;

    @ManyToOne // Puedes necesitar ajustar esto según la relación real
    private Editorial editorial;

    private String  titulo ;
    private String edicion ;
    private Date fechaPublicacion ;
    private int  paginas ;
    private String idiomas ;
    private String genero  ;
    private String estado ;

}
