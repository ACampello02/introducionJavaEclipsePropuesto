package ejercicios;
import java.util.Scanner;
public class Ejercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un numero: ");
		double numero = sc.nextDouble();
		
		if(numero == 0){
		System.out.println("Tu numero es 0");
		}else if(numero > 0) {
			System.out.println("Tu numero es positivo");
	 	}else {
		System.out.println("Tu numero es negativo");
		sc.close();

	}
}
}

