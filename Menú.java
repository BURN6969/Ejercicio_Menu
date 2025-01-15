import java.util.Scanner;

public class Menú {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Introduce una frase:");
        String frase = scn.nextLine();

        int option;
        do {
            System.out.println("Menú:");
            System.out.println("1. Invertir frase");
            System.out.println("2. Pasar a mayúsculas");
            System.out.println("3. Pasar a minúsculas");
            System.out.println("4. Mostrar frase");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            option = scn.nextInt();
            scn.nextLine(); // Limpiar buffer
        
            switch (option) {
                case 2:
                    // frase = pasarMayusculas(frase);
                    break;
                case 3:
                    // frase = pasarMinusculas(frase);
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (option != 5);
        
    }

    public static String pasarMayusculas(String frase) {
        return frase.toUpperCase();
    }
    
    public static String pasarMinusculas(String frase) {
        return frase.toLowerCase();
    }   
    
    
}
