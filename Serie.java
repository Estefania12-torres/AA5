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
