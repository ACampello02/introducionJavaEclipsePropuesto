package ejercicios;
import java.util.Scanner;
public class Ejercicio20 {
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
	System.out.print("Introduce un numero: ");
	int numero = sc.nextInt();
	
	if (esPrimo(numero)) {
		System.out.println("El numero es primo.");
	}else {
		System.out.println("El numero no es primo.");
	}
	sc.close();
}
}