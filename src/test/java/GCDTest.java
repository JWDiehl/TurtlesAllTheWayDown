import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GCDTest {

    @Test
    public void testGCD() {
        assertEquals(8, GCD.gcd(56, 24));

        assertEquals(2, GCD.gcd(88, 46));

        assertEquals(60, GCD.gcd(120, 60));
    }
}
