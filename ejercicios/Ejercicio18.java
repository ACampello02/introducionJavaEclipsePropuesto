package ejercicios;

import java.util.Scanner;

public class Ejercicio18 {
	public static int potencia(int base, int exponente) {
	int resultado = 1;
	for (int a = 1; a <= exponente; a++) {
		resultado = resultado * base;
	}
	return resultado;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce la base: ");
		int base = sc.nextInt();
		
		System.out.print("Introduce el exponente: ");
		int exponente = sc.nextInt();
		
		System.out.println("El resultado es: " + potencia(base, exponente));
		sc.close();
	}

}
