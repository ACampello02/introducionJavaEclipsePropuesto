package ejercicios;
import java.util.Scanner;
public class Ejercicio34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        boolean encontrado = false;
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        System.out.print("Introduce el número que quieres buscar: ");
        int buscar = sc.nextInt();
        for (int i = 0; i < 5; i++) {
            if (numeros[i] == buscar) {
                encontrado = true;
            }
        }
        if (encontrado) {
            System.out.println("El número existe en el array.");
        } else {
            System.out.println("El número no existe en el array.");
        }

        sc.close();
    }
}