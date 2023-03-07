import org.junit.Test;
import inatel.isabela.Fibonacci;
import static org.junit.Assert.assertEquals;

public class FibonacciTeste {

    @Test
    public void testeEntradaMenorIgualAZero() {
        Fibonacci fibo = new Fibonacci();

        long resultado = fibo.result(-2);

        assertEquals(0, resultado);
    }

    @Test
    public void testeEntradaMenorIgualADois() {
        Fibonacci fibo = new Fibonacci();

        long resultado = fibo.result(2);

        assertEquals(1, resultado);
    }

    @Test
    public void testeEntradaMaiorQueDois() {
        Fibonacci fibo = new Fibonacci();

        long resultado = fibo.result(8);

        assertEquals(21, resultado);
    }

}
