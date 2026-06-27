package ejercicios;

import java.util.Scanner;

public class Ejercicio23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();

        int contador = 0;

        for (int a = 0; a < frase.length(); a++) {

            char letra = frase.charAt(i);

            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'
                    || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                contador++;
            }

        }

        System.out.println("La frase tiene " + contador + " vocales.");

        sc.close();
    }
