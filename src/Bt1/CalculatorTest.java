package Bt1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();

        int result1 = calculator.add(5, 3);
        Assert.assertEquals(8, result1);

        int result2 = calculator.add(-2, 7);
        Assert.assertEquals(5, result2);

        int result3 = calculator.add(0, 0);
        Assert.assertEquals(0, result3);
    }

    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator();

        int result1 = calculator.subtract(10, 4);
        Assert.assertEquals(6, result1);

        int result2 = calculator.subtract(-8, 5);
        Assert.assertEquals(-13, result2);

        int result3 = calculator.subtract(0, 0);
        Assert.assertEquals(0, result3);
    }
}