/**
 * 22 Define un array de números enteros de 3 filas por 6 columnas con nombre num
 * y asigna los valores según la siguiente tabla. Muestra el contenido de todos
 * los elementos del array dispuestos en forma de tabla como se muestra en la
 * figura.
 * 
 * @author jotaeme
 */



public class Ejercicio22 {
    public static void main(String[] args) {
        int [] [] num = new int [3] [6]; //[i] [j]

        num[0][0] = 0;
        num[0][1] = 30;
        num[0][2] = 2;
        num[0][5] = 7;
        num[1][0] = 75;
        num[1][4] = 0;
        num[2][2] = -2;
        num[2][3] = 9;
        num[2][5] = 11;

        int fila;
        int columna;
        System.out.print("      ");
        for(columna = 0; columna < 6; columna++) {
            System.out.print("  Columna  " + columna);
        }
        for(fila = 0; fila < 3; fila++) {
            System.out.print("\nFila " + fila);
            for(columna = 0; columna < 6; columna++) {
            System.out.printf("%10d ", num[fila][columna]);
            }
        }
    }
}
