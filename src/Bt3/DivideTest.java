package Bt3;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DivideTest {
    private DivideCation divideCation;

    @Before
    public void setUp() throws Exception {
        divideCation = new DivideCation();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void divide() {
        double a = 5.2;
        double b = 2.0;
        Assert.assertEquals(2.6, divideCation.division(a, b), 0.0001);
    }
}