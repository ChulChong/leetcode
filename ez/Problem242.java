import java.util.HashMap;

public class Problem242 {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
        //https://leetcode.com/problems/valid-anagram/
    }

    public static boolean isAnagram(String s, String t) {
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
    }
}
