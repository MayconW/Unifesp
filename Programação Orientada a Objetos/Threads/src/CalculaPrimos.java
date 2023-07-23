import java.util.Collection;

public class CalculaPrimos extends Thread {

    private final int valorInicial;
    private final int valorFinal;
    private final Collection<Long> primos;

    public CalculaPrimos(int valorInicial, int valorFinal, Collection<Long> primos) {
        this.valorInicial = valorInicial;
        this.valorFinal = valorFinal;
        this.primos = primos;
    }

   
    @Override
    public void run() {
        for (long i = valorInicial; i <= valorFinal; i++) {
            int primo = 0;
            for (int j = 2; j < i; j++) {
                if ((i % j) == 0) {
                    primo++;
                    break;
                }
            }
            if (primo == 0) {
                synchronized (primos) {
                    primos.add(i);
                }
            }
        }

        System.out.println(this.getName() + " terminou!");
    }
}