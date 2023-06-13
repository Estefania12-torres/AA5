// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Map;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Serie serie = new Serie();
        
        // Ejemplo: Obtener el valor de Fibonacci en la posición 50
        int posicion = 50;
        long fibonacci = serie.getFibonacci(posicion);
        
        // Imprimir directamente el HashMap
        Map<Integer, Long> valorList = serie.getValorList();
        System.out.println(valorList);
        
        // Utilizar el Scanner para obtener la posición de Fibonacci desde el usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la posición de Fibonacci: ");
        posicion = scanner.nextInt();
        fibonacci = serie.getFibonacci(posicion);
        System.out.println("El valor de Fibonacci en la posición " + posicion + " es: " + fibonacci);
        scanner.close();   
      
    }
}
