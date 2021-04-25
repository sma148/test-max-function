package nz.ac.auckland.softeng281;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MathOperationsTest {

    @Test
    public void testMax() {
        MathOperations math = new MathOperations();
        assertEquals(10, math.max(10, 5));
    }

    @Test
    public void testThreeMax(){
      MathOperations maths = new MathOperations();
      assertEquals(10,maths.max(5,7,10));
    }

}