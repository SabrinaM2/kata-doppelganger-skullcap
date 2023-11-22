package info;

import info.doubles.FakeAuthorizer;

import org.junit.jupiter.api.Test;
//import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;


public class SafeCalculatorTest {
    @Test //Without Library
    void should_not_throw_when_authorized_without_library() {
        SafeCalculator calculator = new SafeCalculator(new FakeAuthorizer());
        assertDoesNotThrow(() -> calculator.add(2,3));
    }

    /*
    @Test //With Library
    void should_not_throw_when_authorized_without_library_with_Mockito() {

        Authorizer unauthorizedAuthorizer = mock(Authorizer.class);
        when(unauthorizedAuthorizer.authorize()).thenReturn(false);

        SafeCalculator calculator = new SafeCalculator(unauthorizedAuthorizer);
        assertDoesNotThrow(() -> calculator.add(2,3));
    }
}
