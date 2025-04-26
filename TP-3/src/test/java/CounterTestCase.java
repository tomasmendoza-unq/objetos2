import ar.edu.unq.poo2.tp3.Counter;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CounterTestCase {
    private Counter counter;
    /**
     * Crea un escenario de test básico, que consiste en un contador
     * con 10 enteros
     *
     * @throws Exception
     */
    @BeforeEach
    public void setUp() throws Exception {
    //Se crea el contador
        counter = new Counter();
    //Se agregan los numeros. Un solo par y nueve impares

        counter.addNumber(24680);   // todos pares → 5 dígitos pares
        counter.addNumber(13579);   // todos impares → 0 dígitos pares
        counter.addNumber(123456);  // pares: 2, 4, 6 → 3 dígitos pares
        counter.addNumber(888);     // todos pares → 3 dígitos pares
        counter.addNumber(10203);   // pares: 0, 2, 0 → 3 dígitos pares
        counter.addNumber(111222);  // pares: 2, 2, 2 → 3 dígitos pares
        counter.addNumber(-420);    // pares: 4, 2, 0 → 3 dígitos pares (con negativo)

    }
    /**
     * Verifica la cantidad de pares
     */
    @Test
    public void testEvenNumbers() {

        Long amount = counter.getCantPares();

        assertEquals(amount, 5);
    }

    @Test
    public void testMaxNumWithPar() {
        int numero = counter.getMaxNumWithPar();

        assertEquals(numero, 24680);
    }

    @Test
    public void testMaxNum(){
        assertEquals(986, counter.getNumMultXY(58, 29));
        assertEquals(-1, counter.getNumMultXY(17, 1001));
    }
}
