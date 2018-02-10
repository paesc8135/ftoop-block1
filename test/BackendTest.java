import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BackendTest {
    Backend testie = new Backend(25, 5);
    @Test
    void rechneXminusY() {
        assertTrue(testie.getX() > testie.getY());
    }

    @Test
    void rechneXmalY() {
        assertFalse(testie.rechneXmalY() < testie.getX() && testie.rechneXmalY() < testie.getY());
    }

    @Test
    void rechneXmoduloY() {
        assertEquals(testie.rechneXmoduloY(), 0);
    }

}