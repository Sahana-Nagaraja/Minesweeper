import org.junit.Ignore;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class GameEngineTest {
    @Ignore
    @Test
    public void shouldDisplay0OnTheGridWhenFirstCoordinateIsChosen() {
        GameEngine gameEngine = new GameEngine("xxm,xmx,xxx");
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outStream));

        gameEngine.play();

        assertEquals("xxx\nxxx\nxxx\n\nEnter option : \n", outStream.toString());
    }

}
