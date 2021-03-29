package kata_8.remove_exclamation_makks;

/*
https://www.codewars.com/kata/57a0885cbb9944e24c00008e
Write function RemoveExclamationMarks which removes all exclamation marks from a given string.

 */

import static org.junit.Assert.assertEquals;

public class RemoveEclamMarks {
    public static void main(String[] args) {
        testSimpleString1();
    }

    static String removeExclamationMarks(String s) {
        return s.replaceAll("!", "");
    }

    public static void testSimpleString1() {
        assertEquals("Hello World", removeExclamationMarks("Hello World!"));
    }
}
