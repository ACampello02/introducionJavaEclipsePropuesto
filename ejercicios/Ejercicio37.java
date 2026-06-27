package ejercicios;
import java.util.Scanner;
public class Ejercicio37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[5];
        boolean[] contado = new boolean[5];
        for (int a = 0; a < 5; a++) {
            System.out.print("Introduce el número " + (a + 1) + ": ");
            numeros[a] = sc.nextInt();
        }
        for (int a = 0; a < 5; a++) {
            if (!contado[a]) {
                int repeticiones = 1;
                for (int j = a + 1; j < 5; j++) {
                    if (numeros[a] == numeros[j]) {
                        repeticiones++;
                        contado[j] = true;
                    }
                }
                System.out.println("El número " + numeros[a] + " aparece " + repeticiones + " veces.");
            }
        }
        sc.close();
    }
}