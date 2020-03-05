package ro.fasttrackit.curs14.palindrome;

public class PalindromeWithoutReverse implements Palindrome {

    @Override
    public boolean isPalindrome(String word) {
        word = word.toLowerCase();
        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
