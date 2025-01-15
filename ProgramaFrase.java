import java.util.Scanner;

public class ProgramaFrase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase;

        System.out.println("Introduce una frase:");
        frase = scanner.nextLine();

        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Invertir frase");
            System.out.println("2. Pasar a mayúsculas");
            System.out.println("3. Pasar a minúsculas");
            System.out.println("4. Mostrar frase");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada
        } while (opcion != 5);

        scanner.close();
    }
}
