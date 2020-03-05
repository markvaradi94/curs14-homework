package ro.fasttrackit.curs14.codeWars.exercise1;

public class DuplicateEncoder {
    static String encode(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (DuplicateEncoder.countCharacter(word.charAt(i), word) > 1) {
                stringBuilder.append(")");
            } else {
                stringBuilder.append("(");
            }
        }
        return stringBuilder.toString();
    }

    static int countCharacter(char letter, String word) {
        int count = 0;
        String str = "";
        str += letter;
        str = str.toLowerCase();
        letter = str.charAt(0);
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if (letter == word.charAt(i)) {
                count++;
            }
        }
        return count;
    }

    static String encode2(String word){
        word = word.toLowerCase();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < word.length(); ++i) {
            char c = word.charAt(i);
            result.append(word.lastIndexOf(c) == word.indexOf(c) ? "(" : ")");
        }
        return result.toString();
    }
}
