import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GridTest {

    @Test
    public void shouldDisplayOutputGrid() {
        Grid grid = new Grid("xxm,xmx,xxx");

        assertEquals("xxx\nxxx\nxxx\n", grid.displayOutputGrid());
    }

    @Test
    public void shouldReplaceXWith0OnTheGrid() {
        Grid grid = new Grid("xxm,xmx,xxx");
        Coordinate coordinate = new Coordinate(0, 0);
        PlayerInput playerInput = new PlayerInput("o(0,0");
        grid.updateGrid(playerInput);

        assertEquals('0', grid.getOutputGridCoordinate(coordinate));
    }

    @Test
    public void shouldReplaceXWithfOnTheGrid() {
        Grid grid = new Grid("xxm,xmx,xxx");
        Coordinate coordinate = new Coordinate(0, 0);
        PlayerInput playerInput = new PlayerInput("f(0,0");
        grid.updateGrid(playerInput);

        assertEquals('f', grid.getOutputGridCoordinate(coordinate));
    }
}
