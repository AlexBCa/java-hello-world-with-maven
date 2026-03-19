package hello;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class GreeterTest {

    @Test
    void sayHello_returnsExpectedMessage() {
        // Arrange: create the object under test.
        Greeter greeter = new Greeter();

        // Act: invoke the method being verified.
        String result = greeter.sayHello();

        // Assert: check that the greeting is present and exactly as expected.
        assertNotNull(result);
        assertFalse(result.isEmpty());
        assertEquals("DevOps Project for AchiStar Technologies", result);
    }
}