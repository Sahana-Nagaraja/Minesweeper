import org.junit.Test;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.assertEquals;

public class ConsoleInputReaderTest {

    @Test
    public void shouldReadInputFromConsoleAndConvertToLowerCase(){
        System.setIn(new ByteArrayInputStream("Hello".getBytes()));

        assertEquals("hello", new ConsoleInputReader().readSingleInput());
    }
}
