import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class GridTest {

    @Test
    public void shouldDisplayOutputGrid() {
        Grid grid = new Grid("xxm,xmx,xxx");
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outStream));

        grid.displayOutputGrid();

        assertEquals("xxx\nxxx\nxxx\n", outStream.toString());
    }

    @Test
    public void shouldReplaceXWith0OnTheGrid() {
        Grid grid = new Grid("xxm,xmx,xxx");
        Coordinate coordinate = new Coordinate(0, 0);

        grid.replaceCharXWith0(coordinate);

        assertEquals('0', grid.getOutputGridCoordinate(coordinate));
    }

    @Test
    public void shouldReplaceXWithfOnTheGrid() {
        Grid grid = new Grid("xxm,xmx,xxx");
        Coordinate coordinate = new Coordinate(1, 1);

        grid.replaceCharXWithf(coordinate);

        assertEquals('f', grid.getOutputGridCoordinate(coordinate));
    }
}
