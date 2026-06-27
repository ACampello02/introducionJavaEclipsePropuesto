package ejercicios;
import java.util.Scanner;
public class Ejercicio11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un numero: ");
		int numero1 = sc.nextInt();
		
		System.out.println("La tabla de multiplicar del numero" + numero1 + ":");
		for (int a = 1; a <= 10; a++) {
			System.out.println(numero1 + " x " + a + " = " + (numero1 * a));
			
		}
		sc.close();
	}

}
