package ejercicios;
import java.util.Scanner;
public class Ejercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad de términos: ");
        int n = sc.nextInt();
        int b = 0;
        int c = 1;
        int siguiente;
        for (int a = 1; a <= n; a++) {

            System.out.print(b + " ");

            siguiente = b + c;
            b = c;
            c = siguiente;
        }
        sc.close();
    }
}