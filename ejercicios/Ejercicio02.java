package ejercicios;
import java.util.Scanner;
public class Ejercicio02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce tu nombre:");
		String nombre = sc.nextLine();
		
		System.out.print("Introduce tu edad:");
		String edad = sc.nextLine();
		
		System.out.print("Hola " + nombre + ",tienes " + edad + " anos.");
		
		sc.close();
		
	}

}
