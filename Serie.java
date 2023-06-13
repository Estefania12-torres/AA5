//Implementacion del import para la utilizacion del HashMap
//Implementacion del import para la utilizacion del Map
//Implementacion del import para la utilizacion del Scanner 
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
public void calcularFibonacciConScanner(){
    Scanner scanner= new Scanner(System.in);
    System.out.print("Ingrese la posicion de Fibonacci:");
    int posicion=scanner.nextInt();
    long fibonacci=getFibonacci(posicion);
    System.out.println("El valor de Fibonacci en la posicion"+ posicion+"es:"+ fibonacci);
    scanner.close();
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
  



