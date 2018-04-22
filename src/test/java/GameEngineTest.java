import org.junit.Ignore;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GameEngineTest {
@Ignore
    @Test
    public void shouldDisplay0OnTheGridWhenFirstCoordinateIsChosen(){
        GameEngine gameEngine = new GameEngine("xxm,xmx,xxx");
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outStream));
        gameEngine.play();

        assertEquals("Enter option : \n", outStream.toString());

        System.setIn(new ByteArrayInputStream("o(0,0)".getBytes()));
        assertEquals("o(0,0)", new ConsoleInputReader().readSingleInput());

        ByteArrayOutputStream outStream1 = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outStream1));
        assertEquals("0xx\nxxx\nxxx\n", outStream.toString());

    }

}
