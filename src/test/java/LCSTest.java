import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LCSTest {

    @Test
    public void testLCS() {
        String x = "ABCDJSJS";
        String y = "JDJDSJSJSJ";

        String expected = "JSJS";
        String actual = LCS.lcs(x, y);
        assertEquals(expected, actual);
    }
}
