import java.util.Arrays;

public class Problem3467 {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 1};
        System.out.println(Arrays.toString(transformArray(nums)));
    }

    public static int[] transformArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                ans[i] = 0;
            } else {
                ans[i] = 1;
            }
        }
        Arrays.sort(ans);
        return ans;
    }
}
