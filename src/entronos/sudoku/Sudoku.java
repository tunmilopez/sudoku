/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entronos.sudoku;

/**
 *
 * @author tunmi
 */
public class Sudoku {
   
    public Sudoku()
{
    
}
     /**
     * @param metodo para iniciar el sudoku
     */    
public void inicializar()
{
}
@Override
//metodo to String para el resultado final
public String toString()
{
String resultadoFinal = "";
return resultadoFinal;
}
//metodo para introducir los numeros de la fila y la colunma
public void modificarElemento(int fila, int columna, int elemento) throws SudokuException
{
}
//metod para eliminar el numero de la fila y la columna
public void vaciarElemento(int fila, int columna)
{
}
//metodo para comprobar la fila
private boolean comprobarFila(int fila, int elemento)
{
boolean resultado = true;
return resultado;
}
//metodo para comprobar la columna 
private boolean comprobarColumna(int columna, int elemento)
{
boolean resultado = true;
return resultado;
}
//metodo que compruba el cuadrodado donde se meten los numeros
private boolean comprobarCuadrante(int fila, int columna, int elemento)
{
boolean resultado = true;
return resultado;
}
//metodo para insertar los numeros en la fila y la columna
    
private boolean puedoInsertar(int fila, int columna, int elemento)
{
boolean resultado = false;
return resultado;
}
}
    

