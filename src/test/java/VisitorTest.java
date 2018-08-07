import org.junit.Before;
import org.junit.Test;
import visitors.Visitor;

import static org.junit.Assert.assertEquals;


public class VisitorTest {

    Visitor visitor;

    @Before
    public void before(){
        visitor = new Visitor(12, 4.0, 5.00);
    }

    @Test
    public void visitorHasAnAge(){
        assertEquals(12, visitor.getAge());
    }

    @Test
    public void visitorHasHeight(){
        assertEquals(4.0, visitor.getHeight(), 0.1);
    }

    @Test
    public void visitorHasMoney(){
        assertEquals(5.00, visitor.getMoney(), 0.1);
    }
}
