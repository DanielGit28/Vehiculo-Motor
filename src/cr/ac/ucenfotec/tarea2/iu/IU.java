package cr.ac.ucenfotec.tarea2.iu;

import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author Daniel Zúñiga Rojas
 * @version 1.0
 */
public class IU {
    private PrintStream output = new PrintStream(System.out);
    private Scanner input = new Scanner(System.in).useDelimiter("\n");

    public void mostrarMenu() {
        output.println("Bienvenido, escoja una opción");
        output.println("1. Registrar carros");
        output.println("2. Registrar motores");
        output.println("3. Listar carros");
        output.println("4. Listar motores");
        output.println("5. Salir");
    }

    public int leerOpcion() {
        output.println("Su opción es: ");
        return input.nextInt();
    }
    /**
    * @return input.nextInt() el entero que devuelve es la entrada para ingresar un numero entero
     */
    public int leerEnteros() {
        return input.nextInt();
    }
    public void imprimirMensaje(String mensaje) {
        output.println(mensaje);
    }
    /**
     * @return input.next() la cadena de caracteres que devuelve es la entrada para ingresar una cadena de caracteres
     */
    public String leerTexto() {
        return input.next();
    }
}
