/**
 * 6 Escribe un programa que lea 15 números por teclado y que los almacene en un
 * array. Rota los elementos de ese array, es decir, el elemento de la posición 0
 * debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se encuentra en
 * la última posición debe pasar a la posición 0. Finalmente, muestra el contenido
 * del array
 * 
 * @author jotaeme
 */

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numeros[]=new int[15];
        int aux;
        for(int i=0;i<15;i++){
            System.out.print("Dime un números en el array: ");
            numeros[i]=sc.nextInt();
        }
        aux=numeros[14];
        for(int i=13;i>=0;i--){
            numeros[i+1]=numeros[i];
        }
        numeros[0]=aux;
        for(int i=0;i<15;i++){
            System.out.print(numeros[i]+" ");;
        }
        sc.close();
    }
}
