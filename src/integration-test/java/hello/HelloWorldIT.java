package hello;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertTrue;

class HelloWorldIT {

    @Test
    void main_printsCurrentTimeAndGreeting() throws Exception {
        // Arrange: capture the standard output produced by the application.
        PrintStream originalOut = System.out;
        ByteArrayOutputStream outputBuffer = new ByteArrayOutputStream();

        try {
            System.setOut(new PrintStream(outputBuffer, true, StandardCharsets.UTF_8.name()));

            // Act: execute the real application entry point.
            HelloWorld.main(new String[0]);

        } finally {
            // Restore the original standard output to avoid side effects on other tests.
            System.setOut(originalOut);
        }

        // Convert the captured output into text for verification.
        String output = outputBuffer.toString(StandardCharsets.UTF_8.name());

        // Assert: verify that the application prints both the current time line and the greeting.
        assertTrue(
            output.contains("The current local time is:"),
            "The application should print the current local time."
        );
        assertTrue(
            output.contains("DevOps Project for AchiStar Technologies"),
            "The application should print the greeting message."
        );
    }
}