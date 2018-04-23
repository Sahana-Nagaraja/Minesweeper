import org.junit.Test;
import java.io.ByteArrayInputStream;


import static junit.framework.TestCase.assertEquals;

public class MinesweeperApplicationTest {
    @Test
    public void shouldAcceptMinefieldLayoutFromTheUserInConsole(){
        System.setIn(new ByteArrayInputStream("xmx,xxm,mxx".getBytes()));
        assertEquals("xmx,xxm,mxx", new ConsoleInputReader().readSingleInput());
    }
}
