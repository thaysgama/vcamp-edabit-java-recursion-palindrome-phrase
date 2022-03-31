/**
 =================================
 TestGen 3.1 for JUnit 4.13.0
 Test Case: Phrase::isPalindrome
 Timestamp: 10/19/2020 05:11:24 PM
 ---------------------------------
 ® DARKKO 2021 ©
 =================================

 **/

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PhraseTest {

    @Test
    public void test01() {
        assertEquals(true, Phrase.isPalindrome("Maneuquenam"));
    }

    @Test
    public void test02() {
        assertEquals(false, Phrase.isPalindrome("Not a palindrome"));
    }

    @Test
    public void test03() {
        assertEquals(true, Phrase.isPalindrome("A man, a plan, a cat, a ham, a yak, a yam, a hat, a canal-Panama!"));
    }

    @Test
    public void test04() {
        assertEquals(true, Phrase.isPalindrome("Go hang a salami, I'm a lasagna hog!"));
    }

    @Test
    public void test05() {
        assertEquals(false, Phrase.isPalindrome("This phrase is really this!"));
    }

    @Test
    public void test06() {
        assertEquals(true, Phrase.isPalindrome("Red rum, sir, is murder."));
    }

    @Test
    public void test07() {
        assertEquals(true, Phrase.isPalindrome("Big step on no pets, Gib!"));
    }

    @Test
    public void test08() {
        assertEquals(false, Phrase.isPalindrome("One true fortune, but no!"));
    }

    @Test
    public void test09() {
        assertEquals(true, Phrase.isPalindrome("Don't nod."));
    }

    @Test
    public void test10() {
        assertEquals(true, Phrase.isPalindrome("I did, did I?"));
    }

    @Test
    public void test11() {
        assertEquals(true, Phrase.isPalindrome("My gym."));
    }

    @Test
    public void test12() {
        assertEquals(true, Phrase.isPalindrome("Top spot."));
    }

    @Test
    public void test13() {
        assertEquals(true, Phrase.isPalindrome("Was it a cat I saw?"));
    }

    @Test
    public void test14() {
        assertEquals(true, Phrase.isPalindrome("No lemon, no melon."));
    }

    @Test
    public void test15() {
        assertEquals(true, Phrase.isPalindrome("Eva, can I see bees in a cave?"));
    }

    @Test
    public void test16() {
        assertEquals(false, Phrase.isPalindrome("Can I be iconic?"));
    }

    @Test
    public void test17() {
        assertEquals(true, Phrase.isPalindrome("Madam I'm Adam."));
    }

    @Test
    public void test18() {
        assertEquals(false, Phrase.isPalindrome("The man on the moon are them."));
    }

    @Test
    public void test19() {
        assertEquals(true, Phrase.isPalindrome("Sit on a potato pan, Otis."));
    }

    @Test
    public void test20() {
        assertEquals(false, Phrase.isPalindrome("Truly, a classic cadillac!"));
    }

    @Test
    public void test21() {
        assertEquals(true, Phrase.isPalindrome("Able was I, ere I saw Elba."));
    }

    @Test
    public void test22() {
        assertEquals(true, Phrase.isPalindrome("Step on no pets!"));
    }

}
// end of tests