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
            int rest = target - nums[i];
            if (hm.containsKey(rest)) {
                return new int[]{i, hm.get(rest)};
            } else {
                hm.put(nums[i], i);
            }
        }
        return null;
    }
}

   /* public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int rest = target - nums[i];
            //9 - 2  = 7
            if (hm.containsKey(rest)) {
                return new int[]{i, hm.get(rest)};
            } else {
                hm.put(nums[i], i);
            }
        }
        return null;
    }*/










  /*  public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int left = target - nums[i];
            if (hm.containsKey(left)) {
                return new int[]{
                        hm.get(left), i
                };
            } else {
                hm.put(nums[i], i);
            }
        }
        return new int[0];
    }
}*/