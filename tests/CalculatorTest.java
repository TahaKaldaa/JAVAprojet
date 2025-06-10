import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
    @Test
    public void testAddition() {
        assertEquals(6, Calculator.add(3, 3));
    }

    @Test
    public void testSubtraction() {
        assertEquals(6, Calculator.sub(10, 4));
    }
}