package ejercicios;
import java.util.Scanner;
public class Ejercicio25 {
    public static boolean esPrimo(int n) {

        if (n < 2) {
            return false;
        }
        for (int a = 2; a < n; a++) {
            if (n % a == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();

        System.out.println("Los números primos son:");
        for (int a = 1; a <= numero; a++) {
            if (esPrimo(a)) {
                System.out.println(a);
           }
        }
        sc.close();
    }
}