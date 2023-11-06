import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem169 {

    public static void main(String[] args) {
        int[] nums = {6, 6, 6, 7, 7};
        System.out.println(majorityElement(nums));
        //https://leetcode.com/problems/majority-element/description/
    }

    public static int majorityElement(int[] nums) {
        if (nums.length == 1) return nums[0];
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = Integer.MIN_VALUE;
        int num = 0;

        for (int i : nums) {
            if (hm.containsKey(i) && hm.get(i) > count) {
                num = i;
                count = hm.get(i);
            }
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        return num;
    }

    public static int majorityElement2(int[] nums) {
        //runtime O(n log n)
        Arrays.sort(nums);
        int n = nums.length;
        return nums[n / 2];
    }
}
