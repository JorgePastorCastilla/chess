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
public class Peon extends Fichas {

    int[][] movimientos= {
        {0,1},      // 0
        {1,1},      // 1
        {-1,1},     // 2
        {0,-1},     // 3
        {1,-1},     // 4
        {-1,-1},    // 5
        {0,2},      // 6
        {0,-2}      // 7
    };
    
    
    public Peon(int x, int y, color color) {
        xinicial = this.x = x;
        yinicial = this.y = y;
        negro = (color == color.negro);
        representacion= (negro) ? "♙" : "♟" ;
    }

    public Peon(color color) {
        negro = (color == color.negro);
    }
    public boolean movimiento(){
        return true;
    }
    public boolean movimiento(int x, int y) {
        if (negro) {
            for(int c = 0;c < 3;c++){
                if ( (this.x + movimientos[c][0] == x) && (this.y + movimientos[c][1] == y)) {
                    this.x = x;
                    this.y = y;
                    return true;
                }
            }
           /* if ( ( (this.x == this.xinicial) && (this.y == this.yinicial) ) && ((this.x + movimientos[6][0] == x) && (this.y + movimientos[6][1] == y)) ){    
            }*/
        }else{
           for(int c = 3;c < 6;c++){
                if ( (this.x + movimientos[c][0] == x) && (this.y + movimientos[c][1] == y)) {
                    this.x = x;
                    this.y = y;
                    return true;
                }
            } 
        }
        return false;
    }

}
