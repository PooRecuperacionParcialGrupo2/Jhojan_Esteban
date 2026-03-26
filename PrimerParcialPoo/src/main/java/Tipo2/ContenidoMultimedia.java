/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tipo2;

/**
 *
 * @author Jhojan Camilo Osorio, Juan Esteban Valencia
 */
public abstract class ContenidoMultimedia {
    protected String titulo;
    protected int duracionMinutos;
    protected int anioLanzamiento;
    
    public ContenidoMultimedia(String titulo, int duracionMinutos, int anioLanzamiento){
            this.titulo = titulo;
            this.duracionMinutos = duracionMinutos;
            this.anioLanzamiento = anioLanzamiento;
    }
    
    public abstract void iniciarReproduccion();
    
    public String obtenerResumen(){
        return "Titulo :" + titulo + "anio de lanzamiento " + anioLanzamiento;
    } 
}
