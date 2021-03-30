package kata_8.quarter_of_the_year;

import org.junit.Assert;

/*
https://www.codewars.com/kata/5ce9c1000bab0b001134f5af/
Given a month as an integer from 1 to 12, return to which quarter of the year it belongs as an integer number.

For example: month 2 (February), is part of the first quarter; month 6 (June), is part of the second quarter; and month 11 (November), is part of the fourth quarter.
 */
public class QuoterOfYear {
    public static void main(String[] args) {
        fixedTests();
    }

    public static int getQuoter(int month) {
        return (int) Math.ceil((float) month / 3);
    }


    public static void fixedTests() {
        Assert.assertEquals(1, getQuoter(3));
        Assert.assertEquals(3, getQuoter(8));
        Assert.assertEquals(4, getQuoter(11));
    }

}
