package ejercicios;
import java.util.Scanner;
public class Ejercicio07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un numero del 1 al 7: ");
		int numero = sc.nextInt();
		
		switch(numero) {
		case 1:
			System.out.print("Lunes");
			break;
		case 2:
			System.out.print("Martes");
			break;
		case 3:
			System.out.print("Miercoles");
			break;
		case 4:
			System.out.print("Jueves");
			break;
		case 5:
			System.out.print("Viernes");
			break;
		case 6:
			System.out.print("Sabado");
			break;
		case 7:
			System.out.print("Domingo");
			break;
		default:
			System.out.print("El numero no es valido");
		}
		sc.close();
	}
	

}
