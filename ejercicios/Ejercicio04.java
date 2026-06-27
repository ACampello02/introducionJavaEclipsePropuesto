package ejercicios;
import java.util.Scanner;
public class Ejercicio04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el valor de la altura: ");
		double Altura = sc.nextDouble();
		System.out.print("Introduce el valor de la base: ");
		double Base = sc.nextDouble();
		
		double area = (Base * Altura) / 2;
		System.out.println("El area del triangulo es: " + area);
		
		sc.close();
	}
}
