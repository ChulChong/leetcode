import java.util.Arrays;

public class Problem1480 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(runningSum(nums)));
    }

    public static int[] runningSum(int[] nums){
        int sums = 0;
        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            sums += nums[i];
            ans[i] = sums;
        }
        return ans;
    }
}
