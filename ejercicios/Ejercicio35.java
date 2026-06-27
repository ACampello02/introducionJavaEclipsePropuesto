package ejercicios;
import java.util.Scanner;
public class Ejercicio35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        int suma = 0;
        double media;

        for (int i = 0; i < 5; i++) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            suma = suma + numeros[i];
        }
        media = (double) suma / 5;
        System.out.println("La media es: " + media);
        sc.close();
    }
}