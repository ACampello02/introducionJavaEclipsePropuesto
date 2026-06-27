package ejercicios;

import java.util.Scanner;

public class Ejercicio17 {
	public static int maximo(int a, int b) {
		if (a > b) {
			return a;
		}else {
			return b;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el primer numero: ");
		int numero1 = sc.nextInt();
		
		System.out.print("Introduce el segundo numero: ");
		int numero2 = sc.nextInt();
		
		System.out.println("El numero mayor es: " + maximo(numero1, numero2));
		sc.close();
	}

}
