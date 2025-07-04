import org.example.Add;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Addtest {

    @Test
    public void testAdd() {
        Add calc = new Add();
        int result = calc.add(2, 3);
        System.out.println("Result = " + result);
        assertEquals(5, result);
    }
}
