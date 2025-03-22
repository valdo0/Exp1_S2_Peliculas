package com.peliculas.pelicula;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class PeliculaController {

    private  ArrayList<Pelicula> peliculas = new ArrayList<>();
    
    public PeliculaController() {
        peliculas.add(new Pelicula(1, "Titanic", 1997, "James Cameron", "Drama", "Un joven artista y un joven aristócrata se enamoran a bordo del trasatlántico más grande del mundo."));
        peliculas.add(new Pelicula(2, "El Padrino", 1972, "Francis Ford Coppola", "Drama", "El patriarca de una familia mafiosa traslada el control de su imperio clandest"));
        peliculas.add(new Pelicula(3, "El Señor de los Anillos: El Retorno del Rey", 2003, "Peter Jackson", "Fantasía", "La última batalla por la Tierra Media está por comenzar."));
        peliculas.add(new Pelicula(4, "El Rey León", 1994, "Roger Allers, Rob Minkoff", "Animación", "Un joven león debe enfrentar a su tío para reclamar su lugar como rey."));
        peliculas.add(new Pelicula(5, "Harry Potter y la Piedra Filosofal", 2001, "Chris Columbus", "Fantasía", "Un niño descubre que es un mago y es enviado a estudiar a una escuela de magia."));
        peliculas.add(new Pelicula(6, "La La Land", 2016, "Damien Chazelle", "Musical", "Un pianista de jazz y una aspirante a actriz se enamoran en Los Ángeles."));
        peliculas.add(new Pelicula(7, "El Resplandor", 1980, "Stanley Kubrick", "Terror", "Un escritor y su familia se mudan a un hotel aislado durante el invierno."));
    }

    @GetMapping("/peliculas")
    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }
    @GetMapping("/peliculas/{id}")
    public Pelicula getPelicula(@PathVariable int id) {
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getId() == id) {
                return pelicula;
            }
        }
        return null;
    }
    
}
