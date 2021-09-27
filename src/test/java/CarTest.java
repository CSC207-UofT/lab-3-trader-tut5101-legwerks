/*
 * This file contains sample JUnit test cases for Horse.java
 * You should NOT modify this file!
 */

import org.junit.*;

import static org.junit.Assert.*;

public class CarTest {
    Car c;

    @Before
    public void setUp() throws Exception {
        c = new Car();
    }


    @Test(timeout = 50)
    public void TestGetMaxSpeed() {
        assertEquals(5, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestUpgradeSpeed() {
        c.upgradeSpeed();
        assertEquals(6, c.getMaxSpeed());
    }

    @Test(timeout = 50)
    public void TestDowngradeSpeed() {
        c.downgradeSpeed();
        assertEquals(4, c.getMaxSpeed());
    }


}
