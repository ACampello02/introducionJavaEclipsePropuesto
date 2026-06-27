package ejercicios;

import java.util.Scanner;

public class Ejercicio19 {
	public static void saludar(String nombre) {
		System.out.println("Hola " + nombre + " bienvenido");
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce tu nombre: ");
		String nombre = sc.nextLine();
		
		saludar(nombre);
		
		sc.close();
	}

}
