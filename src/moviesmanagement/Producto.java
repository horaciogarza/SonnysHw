/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviesmanagement;

/**
 *
 * @author horaciogarza
 * Para todos los productos se tiene la siguiente información: nombre del producto, 
 * la cantidad a pagar por rentar ese producto, cantidad 
 * de días que se presta al momento de rentar y si en ese 
 * momento el producto está o no disponible.
 */
public class Producto {
    
    private String nombre;
    private double cantidadAPagarPorRenta;
    private int diasAPrestar;
    private boolean estaDisponible;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCantidadAPagarPorRenta() {
        return cantidadAPagarPorRenta;
    }

    public void setCantidadAPagarPorRenta(double cantidadAPagarPorRenta) {
        this.cantidadAPagarPorRenta = cantidadAPagarPorRenta;
    }

    public int getDiasAPrestar() {
        return diasAPrestar;
    }

    public void setDiasAPrestar(int diasAPrestar) {
        this.diasAPrestar = diasAPrestar;
    }

    public boolean isEstaDisponible() {
        return estaDisponible;
    }

    public void setEstaDisponible(boolean estaDisponible) {
        this.estaDisponible = estaDisponible;
    }
    
    
    
    public Producto(){
        
    }
}
