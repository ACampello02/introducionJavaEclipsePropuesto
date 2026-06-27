package ejercicios;
import java.util.Scanner;
public class Ejercicio03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce los grados Celsius: ");
		double celsius = sc.nextDouble();
		
		double farenheit = (celsius * 1.8) + 32;
		
		System.out.println("Los grados farenheit son: " + farenheit);
		
		sc.close();
	}
}
