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
        //es teclado para escribir y la opcion
        Scanner teclado = new Scanner (System.in);
        int opcion = 0;
        
        //este es el menu del sudoku en el que elegiremos las opciones que queramos realizar
        System.out.println("-------Menu sudoku------------------");
        System.out.println("1---- iniciar o reiniciar sudoku");
        System.out.println("2---- realizar movimiento");
        System.out.println("3---- vaciar casilla");
        System.out.println("4---- mostrar sudoku");
        System.out.println("5---- terminar partida");
        System.out.println("-------------------------------------");
        
        
        System.out.println("Dime que opcion quieres elegir:");
        opcion = teclado.nextInt();
        
        //los if para ver la coger la opcion de la que queramos hacer
        if(opcion == 1){
            System.out.println("has elegido la "+opcion);
        }
        if(opcion == 2){
            System.out.println("has elegido la "+opcion);
        }
        if(opcion == 3){
            System.out.println("has elegido la "+opcion);
        }
        if(opcion == 4){
            System.out.println("has elegido la "+opcion);
        }
        if(opcion == 5){
            System.out.println("has elegido la "+opcion);
        
    }
    
}
}
