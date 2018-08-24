
import org.junit.Test;

import static org.junit.Assert.*;

class TestTest {
    @Test
    public void addTest() {
        Maths M = new Maths();
        int A = M.add(2,3);
        assertTrue(A==5);
    }

    @Test
    public void addTest2() {
        Maths M2 = new Maths();
        int B = M2.add(3,6);
        assertTrue(B==9);
    }
}