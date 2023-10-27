package Bt2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationTest {
    private Multiplication multiplication;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void multiply() {
        double a = 3.0;
        double b = 1.5;
        Assert.assertEquals(4.5, multiplication.multiply(a, b), 0);
    }
}