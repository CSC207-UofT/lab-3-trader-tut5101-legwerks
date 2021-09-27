import org.junit.*;

import static org.junit.Assert.*;


public class SharkTest {
    Shark s;

    @Before
    public void setUp() {
        s = new Shark();
    }

    @Test
    public void TestSound() {
        assertEquals("Shaa~", s.sound());
    }

    @Test
    public void TestGetPrice() {
        assertEquals(90, s.getPrice());
    }
}