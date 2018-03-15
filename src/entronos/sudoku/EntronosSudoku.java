/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entronos.sudoku;

import java.util.Scanner;

/**
 *
 * @author tunmi
 */
public class EntronosSudoku {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereç
        Scanner teclado = new Scanner (System.in);
        int opcion;
        
        System.out.println("-------Menu sudoku------------------");
        System.out.println("1---- iniciar o reiniciar sudoku");
        System.out.println("2---- realizar movimiento");
        System.out.println("3---- vaciar casilla");
        System.out.println("4---- mostrar sudoku");
        System.out.println("5---- terminar partida");
        System.out.println("-------------------------------------");
    }
    
}
