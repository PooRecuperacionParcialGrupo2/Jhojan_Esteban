/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tipo2;

/**
 *
 * @author Jhojan Camilo Osorio, Juan Esteban Valencia
 */
public class Pelicula extends ContenidoMultimedia {
    
    private String director;
    
    public Pelicula(String titulo, int duracionMinutos, int anioLanzamiento, String director){
        super(titulo, duracionMinutos, anioLanzamiento);
        this.director = director;
    }
    
    @Override
    public void iniciarReproduccion(){
        System.out.println("cargando video y ajustando subtitulos para la pelicula...");
    }
    
    public void configurarVisualizacion(){
        System.out.println("Reproduciendo en calidad automatica, idioma original...");
    }
    
    public void configurarVisualizacion(String calidad){
        System.out.println("Reproduciendo en calidad" + calidad);
    }
    
    public void configurarVisualizacion(String calidad, String idiomaSubtitulos){
        System.out.println("Reproduciendo en calidad " + calidad + " con subtitulos en " + idiomaSubtitulos);
    }
    
}
