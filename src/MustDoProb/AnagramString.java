package MustDoProb;

import java.util.Arrays;

public class AnagramString {
    static boolean isAnagram(String s, String t) {
        char[] ch1;
        char[] ch2;
        if (s.length() != t.length()) {
            return false;
        } else {
            ch1 = s.toCharArray();
            ch2 = t.toCharArray();
Arrays.sort(ch1);
Arrays.sort(ch2);
        }
        return Arrays.equals(ch1, ch2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("silent","listen"));;
    }
}
