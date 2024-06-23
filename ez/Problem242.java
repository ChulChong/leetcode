import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Problem242 {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
        //https://leetcode.com/problems/valid-anagram/
    }

    public static boolean isAnagram(String s, String t) {
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        Arrays.sort(sc);
        Arrays.sort(tc);
        return Arrays.equals(sc, tc);
    }

 /*   public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();
        HashMap<Character, Integer> hm2 = new HashMap<>();
        for (char c : s.toCharArray()) {
            hm.put(c, hm.getOrDefault(c, 0) + 1);
        }
        for (char c : t.toCharArray()) {
            hm2.put(c, hm2.getOrDefault(c, 0) + 1);
        }
        return hm.equals(hm2);
    }*/


/*    public static boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hm = new HashMap<>();
        int sl = s.length();
        int tl = t.length();
        if (sl != tl) return false;
        for (int i = 0; i < sl; i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
            hm.put(t.charAt(i), hm.getOrDefault(t.charAt(i), 0) - 1);
        }
        for (char c : hm.keySet()) {
            if (hm.get(c) != 0) {
                return false;
            }
        }

        return true;
    }*/
}
