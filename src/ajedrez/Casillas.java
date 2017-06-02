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
        
        negro = (colorcillo == colores.negro);
    }

    public void guardarFicha(Fichas guardar){
        ficha = guardar;
        ocupada = true;
    }
    public void desocupar(){
        ocupada = false;
        this.ficha = null;
    }
    public String toString(){
        if(!ocupada){
            return (negro) ? "☒" : "☐";
        }else{
            return ficha.toString();
        }
    }
}
