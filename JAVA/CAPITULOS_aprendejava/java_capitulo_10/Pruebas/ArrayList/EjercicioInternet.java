package Pruebas.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class EjercicioInternet {
    private static ArrayList<Integer> arrayListInt = new ArrayList<>();
    private static ArrayList<Persona> personas = new ArrayList<>();
    public static void main(String args[]) {
        // Guardo datos en el ArrayList
        arrayListInt.add(3);     arrayListInt.add(4);
        arrayListInt.add(2);    arrayListInt.add(6);
        arrayListInt.add(5);    arrayListInt.add(1);
        arrayListInt.add(7);

        // Imprimo el arrayList de Enteros desordenado
        System.out.println("ArrayList desordenado: ");
        //Así imprimimos el array con su respectivo índice
        printArrayListInt();

        // Ordeno el ArrayList de menor a mayor y lo imprimo
        System.out.println("\nArrayList ordenado de menor a mayor");
        //CON EL MÉTODO SORT
        Collections.sort(arrayListInt);
        printArrayListInt();

        // Ordeno el ArrayList de mayor a menor y lo imprimo
        System.out.println("\nArrayList ordenado de mayor a menor");
        //Comparator es un import de una clase de java
        Comparator<Integer> comparador = Collections.reverseOrder();
        Collections.sort(arrayListInt, comparador);
        printArrayListInt();


        // Guardo datos en el ArrayList de Objetos de la clase persona
        personas.add(new Persona("Pepe", 28));
        personas.add(new Persona("Juan", 32));
        personas.add(new Persona("Paco", 40));
        personas.add(new Persona("Lola", 20));
        personas.add(new Persona("Jose", 28));
        personas.add(new Persona("Dani", 24));
        personas.add(new Persona("Sara", 36));
        personas.add(new Persona("Susi", 24));


        // Imprimo el ArrayList desordenado por edad de la clase persona
        System.out.println("\nArrayList desordenada");
        printArrayListPersona();


        // Odeno el arrayList de menor a mayor por edad y lo imprimo
        System.out.println("\nArrayList ordenado por edad de menor a mayor:");
        Collections.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                return new Integer(p1.getEdad()).compareTo(new Integer(p2.getEdad()));
            }
        });
        printArrayListPersona();


        // Odeno el arrayList de mayor a menor por edad y lo imprimo
        System.out.println("\nArrayList ordenado por edad de mayor a menor:");
        Collections.sort(personas, new Comparator<Persona>() {
            @Override
            public int compare(Persona p1, Persona p2) {
                // Aqui esta el truco, ahora comparamos p2 con p1 y no al reves como antes
                return new Integer(p2.getEdad()).compareTo(new Integer(p1.getEdad()));
            }
        });
        printArrayListPersona();
    }

    private static void printArrayListInt() {
        Iterator<Integer> itrArrayList = arrayListInt.iterator();
        int posicion = 1;
        //MIENTRAS EL ARRAY (arrayListInt), tenga siguiente imprimeme el siguiente
        while (itrArrayList.hasNext()) {
            System.out.println("Posicion(" + posicion + ") = " + itrArrayList.next());
            posicion++;
        }
    }


    private static void printArrayListPersona() {
        Iterator<Persona> itrArrayList = personas.iterator();
        int posicion = 1;
        //MIENTRAS EL ARRAY (personas), tenga siguiente imprimeme el siguiente
        while (itrArrayList.hasNext()) {
            System.out.println("Posicion(" + posicion + ") = " + itrArrayList.next().toString());
            posicion++;
        }
    }
}