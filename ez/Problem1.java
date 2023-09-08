import java.util.*;

public class Problem1 {

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
        //https://leetcode.com/problems/two-sum/
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(target - nums[i]) && hm.get(target - nums[i]) != i) {
                return new int[]{i, hm.get(target - nums[i])};
            }
        }
        return new int[]{};
    }
}