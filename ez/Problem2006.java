import java.util.HashMap;

public class Problem2006 {
    public static void main(String[] args) {
        int[] nums = {3,2,1,5,4,};
        int k = 2;

        System.out.println(countKDifference(nums, k));
    }

//    public static int countKDifference(int[] nums, int k) {
//        int count = 0;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (Math.abs(nums[i] - nums[j]) == k) {
//                    count++;
//                }
//            }
//        }
//
//        return count;
//    }

    public static int countKDifference(int[] nums, int k) {
        int count = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i : nums) {
            if (hm.containsKey(i - k)) {
                count += hm.get(i - k);
            }
            if (hm.containsKey(i + k)) {
                count += hm.get(i + k);
            }
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }

        return count;
    }
}
