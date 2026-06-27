package ejercicios;
import java.util.Scanner;
public class Ejercicio30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];

        for (int a = 0; a < 5; a++) {
            System.out.print("Introduce el número " + (a + 1) + ": ");
            numeros[a] = sc.nextInt();
        }
        int mayor = numeros[0];
        for (int a = 1; a < 5; a++) {
            if (numeros[a] > mayor) {
                mayor = numeros[a];
            }
        }
        System.out.println("El número mayor es: " + mayor);
        sc.close();
    }
}