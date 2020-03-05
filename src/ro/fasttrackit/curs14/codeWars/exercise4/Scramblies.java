package ro.fasttrackit.curs14.codeWars.exercise4;

public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        StringBuilder string1 = new StringBuilder(str1);
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str2.length(); i++) {
            for (int j = 0; j < string1.length(); j++) {
                if (str2.charAt(i) == string1.charAt(j)) {
                    result.append(str2.charAt(i));
                    string1.deleteCharAt(j);
                    break;
                }
            }
        }
        return result.toString().equals(str2);
    }

    public static boolean scramble2(String str1, String str2) {
        if (str2.length() > str1.length()) {
            return false;
        }
        for (String s : str2.split("")) {
            if (!str1.contains(s)) {
                return false;
            }
            str1 = str1.replaceFirst(s, "");
        }
        return true;
    }
}
