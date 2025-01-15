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

	switch (opcion) {
    	case 1:
        // invertirFrase(frase);
        break;
    	case 3:
        // pasarMinusculas(frase);
        break;
    	case 4:
        // mostrarFrase(frase);
        break;
    	case 5:
        System.out.println("¡Adiós!");
        break;
    		default:
        System.out.println("Opción no válida.");
}

        scanner.close();
    }

	public static String pasarMayusculas(String frase) {
		return frase.toUpperCase();
	}
}
