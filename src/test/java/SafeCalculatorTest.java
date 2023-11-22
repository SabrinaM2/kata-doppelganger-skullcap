import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.*;


public class SafeCalculatorTest {
    @Test //Without Library
    void should_not_throw_when_authorized_without_library() {
        SafeCalculator calculator = new SafeCalculator(new FalseAuthorizer());
        assertDoesNotThrow(() -> calculator.add(2,3));
    }
}
