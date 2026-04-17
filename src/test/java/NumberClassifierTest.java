import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberClassifierTest {

    @Test
    void testMixedNumbers() {
        int[] arr = {1, -2, 0};
        String result = NumberClassifier.classifyNumbers(arr);
        assertEquals("Positive: 1, Negative: 1, Zero: 1", result);
    }
}