import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InputChoiceTest {
    @Test
    public void shouldReturnOAsChoice(){
        assertEquals("o", InputChoice.o.toString());
    }
    @Test
    public void shouldReturnfAsChoice(){
        assertEquals("f", InputChoice.f.toString());
    }
    @Test
    public void shouldReturnmAsChoice(){
        assertEquals("m", InputChoice.m.toString());
    }
}
