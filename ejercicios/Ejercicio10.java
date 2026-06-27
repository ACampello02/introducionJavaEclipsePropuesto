package ejercicios;

public class Ejercicio10 {
	public static void main(String[] args) {
		

		System.out.println("Numeros del 1 al 100 con un for: ");
		
		for(int c = 1; c <= 100; c++) {
			System.out.println(c);
		}
System.out.println("Numeros del 1 al 100 con un while: ");
		int b = 1;
		while (b <= 100) {
			System.out.println(b);
			b++;
		}
		
System.out.println("Numeros del 1 al 100 con un do-while: ");
		int a = 1;
		do {
			System.out.println(a);
			a++;
		} while (a <= 100);
}
}