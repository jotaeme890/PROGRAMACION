/**
 * 40 Crea la función de manejo de arrays que tenga la siguiente cabecera y que haga
 * lo que se especifica en los comentarios (puedes incluirla en tu propia biblioteca
 * de rutinas):
 * 
 * @author jotaeme
 */

import java.util.Scanner;
import matematicas.general.arrays;

public class Ejercicio40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime cuanto mide el array: ");
        int n = sc.nextInt();
        System.out.print("Dime el mínimo: ");
        int min = sc.nextInt();
        System.out.print("Dime el máximo: ");
        int max= sc.nextInt();

        int[] num = arrays.generaArrayInt(n, min, max);

        arrays.escribeArray(num);

        arrays.escribeArray(arrays.filtraCon7(num));
        sc.close();
    }
}
