package ejercicios;
import java.util.Scanner;
public class Ejercicio09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce primer numero: ");
		double numero1 = sc.nextDouble();
		System.out.print("Introduce el segundo numero: ");
		double numero2 = sc.nextDouble();
		System.out.print("Introduce el tercer numero: ");
		double numero3 = sc.nextDouble();
		
		if (numero1 >= numero2 && numero1 >= numero3) {
			System.out.println("El numero mayor es:" + numero1);
		}else if (numero2 >= numero1 && numero2 >= numero3) {
		System.out.println("El numero mayor es:" + numero2);
		}else {
			System.out.println("El numero mayor es: " + numero3);
		}
		sc.close();
	}

}
