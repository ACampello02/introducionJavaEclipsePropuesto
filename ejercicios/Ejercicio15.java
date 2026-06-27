package ejercicios;
import java.util.Scanner;
public class Ejercicio15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un numero: ");
		int numero = sc.nextInt();
		
		System.out.println("Multiplos de 3: ");
		
		for(int a = 1; a <= numero; a++) {
			if(a % 3 == 0) {
				System.out.println(a);
			}
			
		}

	}

}
