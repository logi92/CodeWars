package kata_8.reversed_words;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

/*
https://www.codewars.com/kata/51c8991dee245d7ddf00000e/
Complete the solution so that it reverses all of the words within the string passed in.

ReverseWords.reverseWords("The greatest victory is that which requires no battle");
 should return "battle no requires which that is victory greatest The"
 */
public class ReverseWords {
    public static void main(String[] args) {
        testReverseWords();
    }

    public static String reverseWords(String str) {
        String result = Stream.of(str.split(" ")).reduce((s, s2) -> s2 + " " + s).orElse("nope :(");
        return result;
    }


    public static void testReverseWords() {
        assertEquals("eating like I", ReverseWords.reverseWords("I like eating"));
        assertEquals("flying like I", ReverseWords.reverseWords("I like flying"));
        assertEquals("nice is world The", ReverseWords.reverseWords("The world is nice"));
        assertEquals("nice so not is world The", ReverseWords.reverseWords("The world is not so nice"));
        assertEquals("beatiful is Life", ReverseWords.reverseWords("Life is beatiful"));
        assertEquals("won! we hello Hello", ReverseWords.reverseWords("Hello hello we won!"));
    }
}
