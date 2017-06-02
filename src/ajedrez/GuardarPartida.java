/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrez;

import java.io.*;

/**
 *
 * @author ifc33a
 */
public class GuardarPartida {

    public static void guarda(Tablero tablero) {

        try {
            FileOutputStream fileOutput= new FileOutputStream("/home/ifc33a/Escriptori/partida.bin");
            if (tablero.juego instanceof Ajedrez) fileOutput = new FileOutputStream("/home/ifc33a/Escriptori/Ajedrez.bin");
            if (tablero.juego instanceof SoldatsRei) fileOutput = new FileOutputStream("/home/ifc33a/Escriptori/Soldats.bin");
            if (tablero.juego instanceof JuegoDamas) fileOutput = new FileOutputStream("/home/ifc33a/Escriptori/Damas.bin");
            
            ObjectOutputStream objeto = new ObjectOutputStream(fileOutput);

            for (int CX = 0; CX < tablero.col; CX++) {
                for (int CY = 0; CY < tablero.fil; CY++) {
                    if (tablero.tablero[CX][CY].ficha != null) {
                        objeto.writeObject(tablero.tablero[CX][CY].ficha);
                    }
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

}
