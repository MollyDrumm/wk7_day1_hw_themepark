import Attractions.Playground;
import org.junit.Test;
import visitors.Visitor;

import static org.junit.Assert.assertEquals;

public class PlaygroundTest {

    Playground playground;
    Visitor visitor;

    @Test
    public void checkIsAllowedToFalse(){
        playground = new Playground("Giggles");
        visitor = new Visitor(12, 4.00, 5.00);
        assertEquals(false, playground.isAllowedTo(visitor) );
    }

    @Test
    public void checkIsAllowedToTrue() {
        playground = new Playground("Giggles");
        visitor = new Visitor(17, 4.00, 5.00);
        assertEquals(true, playground.isAllowedTo(visitor));
    }
}
