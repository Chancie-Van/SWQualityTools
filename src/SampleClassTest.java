import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for SampleClass.
 */
public class SampleClassTest {

    @Test
    public void testAdditionEqualsFive() {
        SampleClass sc = new SampleClass();
        assertEquals(5, sc.add(2, 3));
    }

    @Test
    public void testAdditionEqualsTen() {
        SampleClass sc = new SampleClass();
        assertEquals(10, sc.add(7, 3));
    }
}