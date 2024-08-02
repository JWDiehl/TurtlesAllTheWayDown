import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FactorialTest {

    @Test
    public void testingFactorialLogic() {
        assertEquals(40320, Factorial.factorial(8));
        assertEquals(6, Factorial.factorial(3));
        assertEquals(479001600, Factorial.factorial(12));
        assertEquals(5040, Factorial.factorial(7));
    }
}
