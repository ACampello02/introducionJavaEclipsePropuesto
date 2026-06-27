package ejercicios;
import java.util.Scanner;
public class Ejercicio33 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Array invertido:");
        for (int i = 4; i >= 0; i--) {
            System.out.println(numeros[i]);
        }
        sc.close();
    }
}
