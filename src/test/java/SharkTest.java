import org.junit.*;

import static org.junit.Assert.*;


public class SharkTest {
    Shark SHARK;

    @Before
    public void setUp() {
        SHARK = new Shark();
    }

    @Test
    public void TestSound() {
        assertEquals("Shaa~", SHARK.sound());
    }

    @Test
    public void TestGetPrice() {
        assertEquals(90, SHARK.getPrice());
    }
}