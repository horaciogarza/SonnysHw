package moviesmanagement;


import moviesmanagement.GeneroDeJuego;
import moviesmanagement.Plataforma;
import moviesmanagement.Producto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author horaciogarza
 */
public class Juego extends Producto {
    
    private GeneroDeJuego estilo;
    private Plataforma plataforma;

    Juego() {
        
    }

    public GeneroDeJuego getEstilo() {
        return estilo;
    }

    public void setEstilo(GeneroDeJuego estilo) {
        this.estilo = estilo;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    public Juego(GeneroDeJuego estilo, Plataforma plataforma) {
        this.estilo = estilo;
        this.plataforma = plataforma;
    }
}
