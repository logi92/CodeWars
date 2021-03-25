package kata_8.you_only_need_one;

import java.util.Arrays;

/*
You will be given an array a and a value x. All you need to do is check whether the provided array contains the value.
Array can contain numbers or strings. X can be either.
Return true if the array contains the value, false if not.
 */

import static org.junit.Assert.assertEquals;

public class YouOnlyNeedOne {
    public static void main(String[] args) {
        solutionTest();
    }

    public static boolean check(Object[] a, Object x) {
        return Arrays.stream(a).anyMatch(i -> i.equals(x));
    }

    public static void solutionTest() {
        assertEquals(check(new Object[] {66, 101}, 66), true);
        assertEquals(check(new Object[] {66, 101}, 66), true);
        assertEquals(check(new Object[] {78, 117, 110, 99, 104, 117, 107, 115}, 8), false);
        assertEquals(check(new Object[] {101, 45, 75, 105, 99, 107}, 107), true);
        assertEquals(check(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 45), true);
        assertEquals(check(new Object[] {'t', 'e', 's', 't'}, 'e'), true);
        assertEquals(check(new Object[] {"what", "a", "great", "kata"}, "kat"), false);
        assertEquals(check(new Object[] {66, 1,"codewars", 11, "alex loves pushups"}, "alex loves pushups"), true);
        assertEquals(check(new Object[] {"come", "on", 110, "2500", 10, '!', 7, 15}, "Come"), false);
        assertEquals(check(new Object[] {"when\'s", "the", "next", "Katathon?", 9, 7}, "Katathon?"), true);
        assertEquals(check(new Object[] {8, 7, 5, "bored", "of", "writing", "tests", 115}, 45), false);
        assertEquals(check(new Object[] {"anyone", "want", "to", "hire", "me?"}, "me?"), true);
    }
}
