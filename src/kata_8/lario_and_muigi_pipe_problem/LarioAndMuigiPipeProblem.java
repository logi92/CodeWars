package kata_8.lario_and_muigi_pipe_problem;

import java.util.stream.IntStream;
/*
https://www.codewars.com/kata/56b29582461215098d00000f/
Given the a list of numbers, return the list so that the values increment by 1 for each index up to the maximum value.

Input: 1,3,5,6,7,8
Output: 1,2,3,4,5,6,7,8
 */
import static org.junit.Assert.assertArrayEquals;

public class LarioAndMuigiPipeProblem {
    public static void main(String[] args) {
        tests();
    }

    public static int[] pipeFix(int[] numbers) {
        return IntStream.rangeClosed(numbers[0], numbers[numbers.length - 1]).toArray();
    }

    public static void tests() {
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, pipeFix(new int[]{1, 2, 3, 5, 6, 8, 9}));
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12}, pipeFix(new int[]{1, 2, 3, 12}));
        assertArrayEquals(new int[]{6, 7, 8, 9}, pipeFix(new int[]{6, 9}));
        assertArrayEquals(new int[]{-1, 0, 1, 2, 3, 4}, pipeFix(new int[]{-1, 4}));
        assertArrayEquals(new int[]{1, 2, 3}, pipeFix(new int[]{1, 2, 3}));
    }
}
