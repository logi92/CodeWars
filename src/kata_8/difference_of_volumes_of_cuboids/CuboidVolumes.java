package kata_8.difference_of_volumes_of_cuboids;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

/*
https://www.codewars.com/kata/58cb43f4256836ed95000f97/
In this simple exercise, you will create a program that will take two lists of integers, a and b. Each list will consist of 3 positive integers above 0,
 representing the dimensions of cuboids a and b. You must find the difference of the cuboids' volumes regardless of which is bigger.

 For example, if the parameters passed are ([2, 2, 3], [5, 4, 1]), the volume of a is 12 and the volume of b is 20. Therefore, the function should return 8.
 */

public class CuboidVolumes {
    public static void main(String[] args) {
        sampleTestCases();
    }

    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {

        int result =
                Stream.of(firstCuboid, secondCuboid)
                        .flatMapToInt(arr -> IntStream.of(Arrays.stream(arr).reduce((x, y) -> x * y).getAsInt()))
                        .reduce((x, y) -> x - y).getAsInt();


        return Math.abs(result);
    }

    public static void sampleTestCases() {
        assertEquals(14, CuboidVolumes.findDifference(new int[]{3, 2, 5}, new int[]{1, 4, 4}));
        assertEquals(106, CuboidVolumes.findDifference(new int[]{9, 7, 2}, new int[]{5, 2, 2}));
        assertEquals(30, CuboidVolumes.findDifference(new int[]{11, 2, 5}, new int[]{1, 10, 8}));
        assertEquals(31, CuboidVolumes.findDifference(new int[]{4, 4, 7}, new int[]{3, 9, 3}));
        assertEquals(0, CuboidVolumes.findDifference(new int[]{15, 20, 25}, new int[]{10, 30, 25}));
    }
}
