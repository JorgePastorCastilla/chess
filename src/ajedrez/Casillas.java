/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

/**
 *
 * @author ifc33a
 */
public class Casillas {
    
    enum colores {blanco, negro};
    boolean negro;
    Fichas ficha;
    boolean ocupada = false;
    public Casillas(colores colorcillo){
        negro = (colorcillo == colores.negro) ? true : false;
    }
    public String toString(){
        return (negro) ? "N" : "B" ;
    }
    public void guardarFicha(Fichas guardar){
        this.ficha = guardar;
        ocupada = true;
    }
}
