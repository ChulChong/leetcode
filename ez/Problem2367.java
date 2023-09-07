import java.util.*;

public class Problem2367 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 4, 6, 7, 10};
        int diff = 3;
        System.out.println(arithmeticTriplets(nums, diff));
        //https://leetcode.com/problems/number-of-arithmetic-triplets/
    }

    public static int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        HashSet<Integer> seen = new HashSet<>();
        for (int i : nums) {
            if (seen.contains(i - diff) && seen.contains(i - diff * 2)) {
                count++;
            }
            seen.add(i);
        }
        return count;
    }


}
