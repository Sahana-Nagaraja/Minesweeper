import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

public class MinesweeperApplicationTest {
    @Test
    public void shouldAcceptMinefieldLayoutFromTheUserInConsole(){
        System.setIn(new ByteArrayInputStream("xmx,xxm,mxx".getBytes()));
        assertEquals("xmx,xxm,mxx", new ConsoleInputReader().readSingleInput());

    }


    @Test
    public void shouldDisplayTheLayoutBasedOnSizeOnConsole(){
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outStream));

        assertEquals("xxx\nxxx\nxxx\n", outStream.toString());

    }

}
