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
public class JuegoDamas extends Juegos {

    public void inicializarJuego(Tablero tablero) {

        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 8; x++) {
                if (tablero.tablero[x][y].negro) {
                    tablero.tablero[x][y].guardarFicha(new Dama(x, y, Fichas.color.blanco));
                }
            }
        }
        
        for (int y = 5; y < 8; y++) {
            for (int x = 0; x < 8; x++) {
                if (tablero.tablero[x][y].negro) {
                    tablero.tablero[x][y].guardarFicha(new Dama(x, y, Fichas.color.negro));
                }
            }
        }
        /*
        tablero.tablero[1][0].guardarFicha(new Dama(1, 0, Fichas.color.blanco));
        tablero.tablero[2][1].guardarFicha(new DamaReina(2, 1, Fichas.color.negro));
        tablero.tablero[4][3].guardarFicha(new DamaReina(4, 3, Fichas.color.negro));
        tablero.tablero[6][5].guardarFicha(new DamaReina(6, 5, Fichas.color.negro));
         */
    }

    public boolean ganar(Tablero tablero) {
        
        int negras = 0;
        int blancas = 0;
        
        for (int y = 0;y < tablero.fil;y++){
            for(int x = 0;x < tablero.col;x++){
                
                if (tablero.tablero[x][y].ocupada){
                    
                    if (tablero.tablero[x][y].ficha.negro){
                        negras++;
                    }else{
                        blancas++;
                    }
                }
            }
        }
        return (negras == 0) || (blancas==0);
    }
}
