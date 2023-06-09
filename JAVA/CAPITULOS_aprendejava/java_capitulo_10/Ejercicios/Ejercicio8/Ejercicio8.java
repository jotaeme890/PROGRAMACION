/**
 *  8 Realiza un programa que escoja al azar 10 cartas de la baraja española
 * (10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
 * almacenarlas y asegúrate de que no se repite ninguna.
 * 
 * @author jotaeme
 */


package Ejercicios.Ejercicio8;

import java.util.ArrayList;

public class Ejercicio8 {
    public static void main(String[] args) {
        ArrayList<Carta> m = new ArrayList<Carta>();

        Carta aux = new Carta();
        m.add(aux);

        for (int i = 0; i < 9; i++) {
            do {
                aux = new Carta();
            } while (m.contains(aux));
            m.add(aux);
        }


        for (Carta carta : m) {
            System.out.println(carta);
        }
    }
}
