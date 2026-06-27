package ejercicios;
import java.util.Scanner;
public class Ejercicio12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero = 1;
		int suma = 0;
		
		while(numero != 0) {
			System.out.print("Introduce un numero(0 si quieres terminar):");
			numero = sc.nextInt();
			
			suma = suma + numero;
		}
		System.out.println("La suma total es: " + suma);
		sc.close();
	}

}
