/**
 * 43 Realiza un programa que pinte un triángulo relleno tal como se muestra en los
 * ejemplos. El usuario debe introducir la altura de la figura. Utiliza funciones para
 * pintar las líneas.
 * 
 * @author jotaeme
 */



import java.util.Scanner;

public class Ejercicio43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca la altura de la figura: ");
        int altura = sc.nextInt();
        for (int i = 0; i < altura; i++) {
            System.out.print(linea(' ', i));
            System.out.println(linea('*', altura - i));
        }
        sc.close();
    }
    public static String linea(char caracter, int repeticiones) {
        String resultado = "";
        for (int i = 0; i < repeticiones; i++) {
            resultado += caracter;
        }
        return resultado;
    }
}

