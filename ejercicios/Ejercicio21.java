package ejercicios;

import java.util.Scanner;

public class Ejercicio21 {
	public static int ContarVocales(String texto) {
	int contador = 0;
	for (int a = 0; a < texto.length(); a++) {
		char letra = texto.charAt(a);
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
			contador++;
		
		}
	}
	return contador;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un texto: ");
		String texto = sc.nextLine();
		
		System.out.println("El numero de vocales es: " + ContarVocales(texto));
		sc.close();
	}

}