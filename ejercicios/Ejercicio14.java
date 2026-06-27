package ejercicios;
import java.util.Scanner;
public class Ejercicio14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un numero: ");
		int numero = sc.nextInt();
		
		int factorial = 1;
		
		for (int a = 1; a <= numero; a++) {
			factorial = factorial * a;
		
		}
		System.out.println("El factorial de" + numero + " es: " + factorial);
		sc.close();
}
}