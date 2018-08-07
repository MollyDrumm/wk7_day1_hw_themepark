import Attractions.Rollercoaster;
import org.junit.Test;
import visitors.Visitor;

import static org.junit.Assert.assertEquals;

public class RollercoasterTest {

    Rollercoaster rollercoaster;
    Visitor visitor;


    @Test
    public void checkIsAllowedToFalse() {
        rollercoaster = new Rollercoaster("Mummy Returns");
        visitor = new Visitor(9, 4.00, 5.00);
        assertEquals(false, rollercoaster.isAllowedTo(visitor));
    }

    @Test
    public void checkIsAllowedToTrue() {
        rollercoaster = new Rollercoaster("Mummy Returns");
        visitor = new Visitor(9, 4.00, 5.00);
        assertEquals(true, rollercoaster.isAllowedTo(visitor));
    }
}
