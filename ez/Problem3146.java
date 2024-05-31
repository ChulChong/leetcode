import java.util.ArrayList;
import java.util.HashMap;

public class Problem3146 {
    public static void main(String[] args) {
        //https://leetcode.com/problems/permutation-difference-between-two-strings/description/
        String s = "abc", t = "bac";
        System.out.println(findPermutationDifference(s, t));
    }

    public static int findPermutationDifference(String s, String t) {
        int ans = 0;
        ArrayList<Character> arr1 = new ArrayList<>();
        ArrayList<Character> arr2 = new ArrayList<>();
        for (char c : s.toCharArray()) {
            arr1.add(c);
        }
        for (char c : t.toCharArray()) {
            arr2.add(c);
        }


        for (int i = 0; i < s.length(); i++) {
            char c = arr1.get(i);
            ans += Math.abs(arr1.indexOf(c) - arr2.indexOf(c));
        }

        return ans;
    }
}
