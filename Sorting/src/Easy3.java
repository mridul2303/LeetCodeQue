import java.util.Arrays;
// Given two strings s and t, return true if t is an anagram of s, and false otherwise.
public class Easy3 {
    public static void main(String[] args) {
        String s = "asdf";
        String t = "fdsa";
        System.out.println(isAnagram(s, t)); // true
    }

    static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] count = new int[26]; // count for a-z

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++; // increase for s
            count[t.charAt(i) - 'a']--; // decrease for t
        }

        for (int c : count) {
            if (c != 0) return false; // mismatch found
        }
        return true; // all counts matched
    }
}
//at last at index of count array values will be 0 if the same char appears in both string
