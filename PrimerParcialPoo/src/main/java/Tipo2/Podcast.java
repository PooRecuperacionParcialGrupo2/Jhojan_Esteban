/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tipo2;

/**
 *
 * @author Jhojan Camilo Osorio, Juan Esteban Valencia
 */
public class Podcast extends ContenidoMultimedia{
    
    private String anfitrion;
    
    public Podcast(String titulo, int duracionMinutos, int anioLanzamiento, String anfitrion){
        super(titulo, duracionMinutos, anioLanzamiento);
        this.anfitrion = anfitrion;
        
    }
    
    @Override
    public void iniciarReproduccion(){
        System.out.println("Conectando al servidor de audio y preparando el episodio del podcast...");
    }
    
    
    
}
