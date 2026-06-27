package ejercicios;
import java.util.Scanner;
public class Ejercicio31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;
        for (int a = 0; a < 5; a++) {
            System.out.print("Introduce el número " + (a + 1) + ": ");
            numeros[a] = sc.nextInt();
        }
        for (int a = 0; a < 5; a++) {
            suma = suma + numeros[a];
        }
        System.out.println("La suma de los números es: " + suma);
        sc.close();
    }
}