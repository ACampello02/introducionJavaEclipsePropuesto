package ejercicios;
import java.util.Scanner;
public class Ejercicio01 {

	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el primer numero");
		double numero1 = sc.nextDouble();
		
		System.out.print("Introduce el segundo numero");
		double numero2 = sc.nextDouble();
		
		System.out.println("Suma:" + (numero1 + numero2));
		System.out.println("Resta:" + (numero1 - numero2));
		System.out.println("Multiplicacion:" + (numero1 * numero2));
	
		if (numero2 != 0) {
			System.out.println("Division" + (numero1 / numero2));
			
		}else {
			System.out.print("No se puede dividir entre 0");
		}
	sc.close();
	}
}

