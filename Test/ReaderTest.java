import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReaderTest {

    private Reader reader;
    private InputStream originalInputStream;
    private PrintStream originalSystemOut;
    private ByteArrayOutputStream outputStream;

    @BeforeEach
    public void setUp() {
        // Save the original input stream and system output stream
        originalInputStream = System.in;
        originalSystemOut = System.out;

        // Set the input stream to a custom input stream with the desired input
        String input = "test\n";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        // Redirect the system output stream to a custom output stream
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));

        reader = new Reader();
    }

    @AfterEach
    public void tearDown() {
        // Reset the original input stream and system output stream
        System.setIn(originalInputStream);
        System.setOut(originalSystemOut);
    }

    @Test
    public void testGetStringInputWithNonEmptyInput() {
        // Arrange - input stream is set to "test\n" in setUp()

        // Act
        String input = reader.getStringInput();

        // Assert
        assertEquals("test", input);
    }
}
