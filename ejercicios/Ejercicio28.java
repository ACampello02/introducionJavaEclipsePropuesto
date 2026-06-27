package ejercicios;
import java.util.Scanner;
public class Ejercicio28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        double saldo = 1000;
        double cantidad;
        do {
            System.out.println("\n----- CAJERO AUTOMÁTICO -----");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Ingresar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            switch (opcion) {
            case 1:
                System.out.println("Saldo disponible: " + saldo + " €");
                break;
            case 2:
                System.out.print("Cantidad a ingresar: ");
                cantidad = sc.nextDouble();
                saldo = saldo + cantidad;
                System.out.println("Nuevo saldo: " + saldo + " €");
                break;
            case 3:
                System.out.print("Cantidad a retirar: ");
                cantidad = sc.nextDouble();
                if (cantidad <= saldo) {
                    saldo = saldo - cantidad;
                    System.out.println("Nuevo saldo: " + saldo + " €");
                } else {
                    System.out.println("No tienes saldo suficiente.");
                }
                break;
            case 0:
                System.out.println("Gracias por usar el cajero.");
                break;
            default:
                System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
        sc.close();
    }
}