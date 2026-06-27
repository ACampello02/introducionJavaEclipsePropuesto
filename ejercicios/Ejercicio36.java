package ejercicios;
import java.util.Scanner;
public class Ejercicio36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        boolean palindromo = true;
        for (int a = 0; a < 5; a++) {
            System.out.print("Introduce el número " + (a + 1) + ": ");
            numeros[a] = sc.nextInt();
        }
        for (int a = 0; a < 5 / 2; a++) {
            if (numeros[a] != numeros[4 - a]) {
                palindromo = false;
            }
        }
        if (palindromo) {
            System.out.println("El array es un palíndromo.");
        } else {
            System.out.println("El array no es un palíndromo.");
        }
        sc.close();
    }
}