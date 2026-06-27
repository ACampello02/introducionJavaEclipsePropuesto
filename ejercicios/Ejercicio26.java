package ejercicios;
import java.util.Scanner;
public class Ejercicio26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String nombre;
        int cantidad = 0;
        String nombreLargo = "";
        String nombreCorto = "";
        
        System.out.print("Introduce un nombre (fin para terminar): ");
        nombre = sc.nextLine();
        while (!nombre.equals("fin")) {
            cantidad++;
            if (cantidad == 1) {
                nombreLargo = nombre;
                nombreCorto = nombre;
            } else {
                if (nombre.length() > nombreLargo.length()) {
                    nombreLargo = nombre;
                }
                if (nombre.length() < nombreCorto.length()) {
                    nombreCorto = nombre;
                }
            }
            System.out.print("Introduce un nombre (fin para terminar): ");
            nombre = sc.nextLine();
        }
        System.out.println("Cantidad de nombres: " + cantidad);
        System.out.println("Nombre más largo: " + nombreLargo);
        System.out.println("Nombre más corto: " + nombreCorto);
        sc.close();
    }
}