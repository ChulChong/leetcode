import java.util.HashMap;

public class Problem383 {
    public static void main(String[] args) {
        String ransomNote = "aa", magazine = "abb";

        System.out.println(canConstruct(ransomNote, magazine));

        //https://leetcode.com/problems/ransom-note/description/
    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }
        int[] arr = new int[26];

        for (char c : magazine.toCharArray()) {
            arr[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            if (arr[c - 'a'] == 0) return false;
            arr[c - 'a']--;
        }

        return true;
    }
}
