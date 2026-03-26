/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tipo2;

/**
 *
 * @author juane
 */
public class AppStreaming {
    public static void main(String[] args) {
        Pelicula[] peliculas = new Pelicula[4];
        Podcast[] podcast = new Podcast[4];
        
        agregarPelicula(peliculas, new Pelicula("Inception", 148, 2010, "Christopher Nolan"), 0);
        agregarPelicula(peliculas, new Pelicula("Interstellar", 169, 2014, "Christopher Nolan"), 1);
        agregarPelicula(peliculas, new Pelicula("The Matrix", 136, 1999, "Lana Wachowski"), 2);
        agregarPelicula(peliculas, new Pelicula("Inception", 120, 2020, "Christopher Nolan"), 3); 
        agregarPelicula(peliculas, new Pelicula("Parasite", 132, 2019, "Bong Joon-ho"), 3);

        agregarPodcast(podcast, new Podcast("Tech Hoy", 45, 2023, "Juan Perez"), 0);
        agregarPodcast(podcast, new Podcast("Historia Oculta", 60, 2022, "Maria Lopez"), 1);
        agregarPodcast(podcast, new Podcast("Cine en casa", 30, 2024, "Carlos Ruiz"), 2);
        agregarPodcast(podcast, new Podcast("Finanzas Claras", 40, 2023, "Ana Gomez"), 3);

        for (Pelicula p : peliculas) {
            if (p != null) { 
                System.out.println(p.obtenerResumen()); 
                p.iniciarReproduccion();               
                System.out.println("");
            }
        }

       
        for (Podcast po : podcast) {
            if (po != null) {
                System.out.println(po.obtenerResumen()); 
                po.iniciarReproduccion();                
                System.out.println("");
            }
        }

        
        if (peliculas[0] != null) {
            System.out.println("Película seleccionada: " + peliculas[0].titulo);
            peliculas[0].configurarVisualizacion();              
            peliculas[0].configurarVisualizacion("1080p");        
            peliculas[0].configurarVisualizacion("4K", "Francés"); 
        }
    }

    public static void agregarPelicula(Pelicula[] arreglo, Pelicula nueva, int pos) {
        boolean existe = false;
        for (Pelicula arreglo1 : arreglo) {
            if (arreglo1 != null && arreglo1.titulo.equalsIgnoreCase(nueva.titulo)) {
                existe = true;
                break;
            }
        }
        if (existe) {
            System.out.println("pelicula repetida");
        } else {
            arreglo[pos] = nueva;
        }
    }

    public static void agregarPodcast(Podcast[] arreglo, Podcast nuevo, int pos) {
        boolean existe = false;
        for (Podcast arreglo1 : arreglo) {
            if (arreglo1 != null && arreglo1.titulo.equalsIgnoreCase(nuevo.titulo)) {
                existe = true;
                break;
            }
        }
        if (existe) {
            System.out.println("podcast repetido");
        } else {
            arreglo[pos] = nuevo;
        }
    }
}    


