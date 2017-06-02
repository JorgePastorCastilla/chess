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
public class CargarPartida {

    public static void cargar(Tablero tablero) {

        Fichas f;

        try {
             FileInputStream fileInput= new FileInputStream("/home/ifc33a/Escriptori/partida.bin");
            if (tablero.juego instanceof Ajedrez) fileInput = new FileInputStream("/home/ifc33a/Escriptori/Ajedrez.bin");
            if (tablero.juego instanceof SoldatsRei) fileInput = new FileInputStream("/home/ifc33a/Escriptori/Soldats.bin");
            if (tablero.juego instanceof JuegoDamas) fileInput = new FileInputStream("/home/ifc33a/Escriptori/Damas.bin");
            ObjectInputStream objeto = new ObjectInputStream(fileInput);

            while (true) {
                
                f = (Fichas) objeto.readObject();
                tablero.tablero[f.x][f.y].guardarFicha(f);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
