import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CoordinateTest {

    @Test
    public void shouldUpdate0InFirstCoordinate(){
        Coordinate coordinate = new Coordinate(1,2);

        assertEquals(1,coordinate.getX());
        assertEquals(2,coordinate.getY());

    }

    @Test
    public void shouldReplaceGridBy0forInputChoiceO(){
        Coordinate coordinate = new Coordinate(1,1);
        coordinate.updateGrid(InputChoice.f);
    }

}
