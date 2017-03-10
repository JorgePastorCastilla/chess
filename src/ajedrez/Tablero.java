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
public class Tablero {

    int fil = 8;
    int col = 8;
    Casillas[][] tablero = new Casillas[fil][col];

    public void ini() {
        for (int x = 0; x < fil; x++) {
            boolean negri = (x % 2 == 0) ? true : false;
            for (int y = 0; y < col; y++) {
                tablero[x][y] = (negri) ? new Casillas(Casillas.colores.negro) : new Casillas(Casillas.colores.blanco);
                negri = !negri;
            }
        }
    }

    public void mostrar() {

        for (int x = 0; x < fil; x++) {
            for (int y = 0; y < col; y++) {
                System.out.print(tablero[x][y] + " ");
            }
            System.out.println("");
        }
    }

}
