package ejercicios;
import java.util.Scanner;
public class Ejercicio08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un ano: ");
		int ano = sc.nextInt();
		
		if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println("El ano es bisiesto.");
				}else {
					System.out.println("El ano no es bisiesto.");
				}
sc.close();
}
}