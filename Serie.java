import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Serie {
  
  private Map<Integer, Long> valorList;
  
  public Serie() {
     this.valorList = new HashMap<>();
}
public long getFibonacci(int posicion) {
            if (posicion == 0 || posicion == 1) {
                return 1;
            } else {
                if (valorList.containsKey(posicion)) {
                    return valorList.get(posicion);
                }

                long resultado = getFibonacci(posicion - 1) + getFibonacci(posicion - 2);
                valorList.put(posicion, resultado);

                return resultado;
            }
        }
public void calcularFibonacciConScanner(){  // Esto define un método público llamado calcularFibonacciConScanner que no devuelve ningún valor (void).
    Scanner scanner= new Scanner(System.in); //Crea una instancia de la clase Scanner llamada scanner y la inicializa para leer la entrada del usuario desde la consola (System.in).
    System.out.print("Ingrese la posicion de Fibonacci:"); //Imprime el mensaje "Ingrese la posición de Fibonacci:" en la consola sin una nueva línea.
    int posicion=scanner.nextInt(); //Lee un número entero ingresado por el usuario utilizando el objeto scanner y lo asigna a la variable posicion
    long fibonacci=getFibonacci(posicion); //Llama a un método llamado getFibonacci pasando la variable posicion como argumento y asigna el resultado a la variable fibonacci
    System.out.println("El valor de Fibonacci en la posicion"+ posicion+"es:"+ fibonacci); //: Imprime en la consola el mensaje. La función println agrega una nueva línea al final.
    scanner.close(); //Cierra el objeto scanner para liberar los recursos asociados a la entrada del usuario.
}
  public Map<Integer, Long> getValorList() { // es un método de acceso (getter) para obtener el campo valorList. 
            return valorList; //Devuelve un Map<Integer, Long>, que es el tipo de dato especificado en la declaración de la clase.
        }
  
        public void setValorList(Map<Integer, Long> valorList) { //es un método de modificación (setter) que establece el campo valorList con el valor pasado como argumento.
            this.valorList = valorList; // El argumento es un Map<Integer, Long>. El uso de this.valorList se refiere al campo de la clase, mientras que valorList sin this se refiere al parámetro del método.
        }

        @Override
        public String toString() { // es una anulación del método toString() de la clase base Object
            return "Serie{valorList=" + valorList + '}';  //Devuelve una representación en forma de cadena de la instancia de la clase Serie
        }
    }
  
