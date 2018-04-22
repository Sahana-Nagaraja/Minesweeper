import org.junit.Ignore;
import org.junit.Test;
import java.io.ByteArrayInputStream;
import static junit.framework.TestCase.assertEquals;

public class PlayerInputTest {
    @Test
    public void shouldAcceptChoiceOFromUser() {
        System.setIn(new ByteArrayInputStream("o(0,0)".getBytes()));
        ConsoleInputReader consoleInputReader = new ConsoleInputReader();

        PlayerInput playerInput = new PlayerInput(consoleInputReader.readSingleInput());

        assertEquals(InputChoice.o, playerInput.getChoice());
    }

    @Ignore
    @Test
    public void shouldReturn0asX() {
        System.setIn(new ByteArrayInputStream("o(0,0)".getBytes()));
        ConsoleInputReader consoleInputReader = new ConsoleInputReader();

        PlayerInput playerInput = new PlayerInput(consoleInputReader.readSingleInput());

        assertEquals(0, playerInput.getX());
    }

    @Ignore
    @Test
    public void shouldReturn1asY() {
        System.setIn(new ByteArrayInputStream("o(0,1)".getBytes()));
        ConsoleInputReader consoleInputReader = new ConsoleInputReader();

        PlayerInput playerInput = new PlayerInput(consoleInputReader.readSingleInput());

        assertEquals(1, playerInput.getY());
    }
}
