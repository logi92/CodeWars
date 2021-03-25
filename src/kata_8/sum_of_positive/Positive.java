package kata_8.sum_of_positive;

import java.util.Arrays;
import static org.junit.Assert.assertEquals;

/*
https://www.codewars.com/kata/5715eaedb436cf5606000381/
Description:
You get an array of numbers, return the sum of all of the positives ones.

Example [1,-4,7,12] => 1 + 7 + 12 = 20

Note: if there is nothing to sum, the sum is default to 0.
 */

public class Positive {
    public static void main(String[] args) {
        testPositive();
    }

    public static int sum(int[] arr) {
        int result = Arrays.stream(arr).filter(i -> i > 0).reduce((x, y) -> x + y).orElse(0);
        // or Arrays.stream(arr).filter(i -> i > 0).sum();
        // or IntStream.of(arr).filter(x -> x > 0).sum();
        return result;
    }

    public static void testPositive() {
        assertEquals(15, Positive.sum(new int[]{1, 2, 3, 4, 5}));
        assertEquals(13, Positive.sum(new int[]{1, -2, 3, 4, 5}));
        assertEquals(0, Positive.sum(new int[]{}));
        assertEquals(0, Positive.sum(new int[]{-1, -2, -3, -4, -5}));
        assertEquals(9, Positive.sum(new int[]{-1, 2, 3, 4, -5}));
    }
}
