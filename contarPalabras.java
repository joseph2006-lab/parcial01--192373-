
import java.util.Scanner;

public class contarPalabras {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Porfavor ingrese su cadena de texto: ");
        String palabra = scanner.nextLine();
        System.out.println(palabra);
        palabra = palabra.trim().replaceAll("\\s+", " ");
        String[] palabras = palabra.split(" ");
        System.out.println(palabras.length);
    }
}
