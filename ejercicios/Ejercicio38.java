package ejercicios;
import java.util.Scanner;
public class Ejercicio38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aleatorio = (int) (Math.random() * 50) + 1;
        int numero;
        do {
            System.out.print("Adivina el número (1-50): ");
            numero = sc.nextInt();
            if (numero < aleatorio) {
                System.out.println("El número es mayor.");
            } else if (numero > aleatorio) {
                System.out.println("El número es menor.");
            } else {
                System.out.println("¡Has acertado!");
            }
        } while (numero != aleatorio);

        sc.close();
    }
}