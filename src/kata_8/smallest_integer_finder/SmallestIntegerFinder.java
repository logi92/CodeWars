package kata_8.smallest_integer_finder;

/*
https://www.codewars.com/kata/55a2d7ebe362935a210000b2/
Given an array of integers your solution should find the smallest integer.

For example:
Given [34, 15, 88, 2] your solution will return 2
Given [34, -345, -1, 100] your solution will return -345
 */
import java.util.stream.IntStream;

public class SmallestIntegerFinder {
    public static void main(String[] args) {
        System.out.println(findSmallestInt(new int[]{34, -345, -1, 100}));
    }

    public static int findSmallestInt(int[] args) {
        return IntStream.of(args).min().orElse(0);
    }

}
