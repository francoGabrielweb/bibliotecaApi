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
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private   Long  isbn  ;

    private String  titulo ;

    //private Autor  autor;


    //private Editorial  editorial ;


    private String edicion ;


    private Date fechaPublicacion ;


    private int  paginas ;


    private String  idiomas ;

    private String genero  ;


    private String estado ;







}
