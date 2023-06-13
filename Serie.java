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
  public Map<Integer, Long> getValorList() {
            return valorList;
        }
  
        public void setValorList(Map<Integer, Long> valorList) {
            this.valorList = valorList;
        }

        @Override
        public String toString() {
            return "Serie{valorList=" + valorList + '}';
        }
    }
  
