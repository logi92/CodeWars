package kata_8.the_most_asked_question;

import java.util.stream.Stream;

/*
https://www.codewars.com/kata/5935ecef7705f9614500002d/
You need to write a function detect that will check if a string starts with Can someone explain,
 case sensitive. Return true if so, false otherwise.
 */
import static org.junit.Assert.assertEquals;

public class CodeWars {
    public static void main(String[] args) {
        testSomething();
    }

    public static boolean detect(String comment) {
        boolean isBegin = Stream.of(comment).anyMatch(s -> s.startsWith("Can someone explain"));
        return isBegin;
    }

    public static void testSomething() {
        assertEquals(true, CodeWars.detect("Can someone explain to me what this kata is about?"));
        assertEquals(false, CodeWars.detect("Can someone solve this kata for me?"));
        assertEquals(false, CodeWars.detect("can someone explain to me how to enable caps lock/"));
    }
}
