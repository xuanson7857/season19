package Bt4;

import org.junit.Assert;
import org.junit.Test;

public class FindMaxTest {

    @Test
    public void testFindMax() {
        int[] numbers = {1, 5, 3, 8, 2};
        int expected = 8;

        int result = findMax(numbers);

        Assert.assertEquals(expected, result);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaxWithEmptyArray() {
        int[] numbers = {};
        findMax(numbers);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFindMaxWithNullArray() {
        int[] numbers = null;
        findMax(numbers);
    }

    private int findMax(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("The input array must not be null or empty");
        }

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}
