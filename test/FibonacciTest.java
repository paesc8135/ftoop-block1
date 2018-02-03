import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    @Test
    void main() {
        Fibonacci testie = new Fibonacci();
        assertTrue(testie.getElapsedTime() < testie.getElapsedTimeR());
    }

}