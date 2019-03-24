import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void normalFibonacci() {
        Assertions.assertEquals(55, Fibonacci.normalFibonacci(10));
    }

    @Test
    void saveMemFibonacci() {
        Assertions.assertEquals(55, Fibonacci.saveMemFibonacci(10));
    }
}