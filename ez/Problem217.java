import java.util.HashMap;
import java.util.HashSet;

public class Problem217 {
    public static void main(String[] args) {
        //https://leetcode.com/problems/contains-duplicate/
        int[] nums = {3, 3};
        System.out.println(containsDuplicate(nums));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i : nums) {
            if (hs.contains(i)) {
                return true;
            } else {
                hs.add(i);
            }
        }
        return false;
    }
}
