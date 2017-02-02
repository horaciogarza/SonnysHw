/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviesmanagement;

/**
 *
 * @author horaciogarza
 */
public class Pelicula extends Producto {
    
    private Genero generoDePelicula;
    private int anoDeProduccion;

    public Pelicula(Genero generoDePelicula, int anoDeProduccion) {
        this.generoDePelicula = generoDePelicula;
        this.anoDeProduccion = anoDeProduccion;
    }

    public Pelicula() {
    }
    
    public Genero getGeneroDePelicula() {
        return generoDePelicula;
    }

    public void setGeneroDePelicula(Genero generoDePelicula) {
        this.generoDePelicula = generoDePelicula;
    }

    public int getAnoDeProduccion() {
        return anoDeProduccion;
    }

    public void setAnoDeProduccion(int anoDeProduccion) {
        this.anoDeProduccion = anoDeProduccion;
    }
    
}
