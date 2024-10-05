
import java.util.Scanner;

public class contarDigitos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();
        int contador = 0;
        if (numero == 0) {
            contador = 1;
        } else {
            while (numero > 0) {
                numero /= 10;
                contador++;
            }
        }
        System.out.println("El número tiene " + contador + " dígito(s).");
        scanner.close();
    }
}
