package ejercicios;
import java.util.Scanner;
public class Ejercicio32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int contador = 0;
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {

            if (numeros[i] % 2 == 0) {
                contador++;
            }
        }
        System.out.println("Hay " + contador + " números pares.");
        sc.close();
    }
}