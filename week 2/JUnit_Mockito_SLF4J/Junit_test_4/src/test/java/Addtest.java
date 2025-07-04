import org.example.Add;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Addtest {

    private Add calculator;

    @Before
    public void setUp() {
        calculator = new Add(); // Arrange
        System.out.println("Setup complete");
    }

    @After
    public void end() {
        System.out.println("Teardown complete");
    }

    @Test
    public void testAddition() {
        int result = calculator.add(2, 3);
        System.out.println(result);

        assertEquals(5, result);
    }

}
