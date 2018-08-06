import ThemePark.Attractions.Playground;
import ThemePark.Visitor;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;

    @Test
    public void checkIsAllowedTo(){
        Visitor visitor = new Visitor(12, 4.0, 5.00);
        assertEquals(false, playground.isAllowedTo(visitor) );
    }
}
