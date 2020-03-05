package ro.fasttrackit.curs14.palindrome;

public class PalindromeReverse implements Palindrome {


    public static String reverseWord(String word) {
        return new StringBuilder(word).reverse().toString();
    }

    @Override
    public boolean isPalindrome(String word) {
        return word.equalsIgnoreCase(reverseWord(word));
    }
}
