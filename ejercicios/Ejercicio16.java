package ejercicios;
import java.util.Scanner;
public class Ejercicio16 {
	public static boolean esPar(int n) {
		if (n % 2 == 0) {
			return true;
		}else {
			return false;
		}

	}
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Introduce un numero: ");
	int numero = sc.nextInt();
	
	if (esPar(numero)) {
		System.out.println("El numero es par.");
	}else {
		System.out.println("El numero es impar.");
	}
	sc.close();
}
}