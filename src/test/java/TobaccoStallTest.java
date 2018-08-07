import Stalls.TobaccoStall;
import org.junit.Test;
import visitors.Visitor;

import static org.junit.Assert.assertEquals;

public class TobaccoStallTest {

    TobaccoStall tobaccoStall;
    Visitor visitor;

    @Test
    public void checkIsAllowedToFalse() {
        tobaccoStall = new TobaccoStall("Smokey Joes", "Joe", 32);
        visitor = new Visitor(12, 4.00, 5.00);
        assertEquals(false, tobaccoStall.isAllowedTo(visitor));
    }

    @Test
    public void checkIsAllowedToTrue() {
        tobaccoStall = new TobaccoStall("Smokey Joes", "Joe", 32);
        visitor = new Visitor(19, 4.00, 5.00);
        assertEquals(true, tobaccoStall.isAllowedTo(visitor));
    }
}
