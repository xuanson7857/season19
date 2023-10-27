package Bt5;

import org.junit.Assert;
import org.junit.Test;

public class FindMinTest {
    @Test
    public void testFindMin() {
        int[] arr = {5, 3, 8, 2, 7};
        int expected = 2;

        int result = Findmin.findMin(arr);

        Assert.assertEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMinWithEmptyArray() {
        int[] arr = {};
        Findmin.findMin(arr);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMinWithNullArray() {
        int[] arr = null;
        Findmin.findMin(arr);
    }
}
