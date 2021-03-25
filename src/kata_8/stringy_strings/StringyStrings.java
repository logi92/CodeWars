package kata_8.stringy_strings;

import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

/*
The string should start with a 1.
a string with size 6 should return :'101010'.
with size 4 should return : '1010'.
with size 12 should return : '101010101010'.
 */
public class StringyStrings {
    public static void main(String[] args) {
        stringy(5);
    }

    public static String stringy(int size) {
        return Stream.iterate("1", s -> s.equals("1") ? "0" : "1").limit(size).collect(Collectors.joining(""));
    }

    public static void startTest() {
        assertEquals("Your string should start with a 1", '1', stringy(3).charAt(0));
    }

    public static void lengthTests() {
        Random randGen = new Random();
        for (int i = 0; i < 10; i++) {
            int size = randGen.nextInt(50);
            assertEquals("Wrong length using size " + size, size, stringy(size).length());
        }
    }
}
