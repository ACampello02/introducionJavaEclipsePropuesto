package ejercicios;
import java.util.Scanner;
public class Ejercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double nota;
        double suma = 0;
        double mayor = 0;
        double menor = 0;
        for (int a = 1; a <= 5; a++) {
        	System.out.print("Introduce la nota " + a + ": ");
            nota = sc.nextDouble();
            suma = suma + nota;

            if (a == 1) {
                mayor = nota;
                menor = nota;
            } else {
                if (nota > mayor) {
                    mayor = nota;
                }
                if (nota < menor) {
                    menor = nota;
                }
            }
        }

        double media = suma / 5;
        System.out.println("La media es: " + media);
        System.out.println("La nota más alta es: " + mayor);
        System.out.println("La nota más baja es: " + menor);
        sc.close();
    }
}