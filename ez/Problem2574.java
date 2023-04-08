import java.util.Arrays;

public class Problem2574 {
    public static void main(String[] args) {

        int[] nums = {10, 4, 8, 3};
        System.out.println(Arrays.toString(leftRigthDifference(nums)));
        //https://leetcode.com/problems/left-and-right-sum-differences/
    }

    public static int[] leftRigthDifference(int[] nums) {
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        int[] ans = new int[nums.length];
        int leftTempSum = 0;
        int rightTempSum = 0;

        for (int i = 0; i < nums.length; i++) {
            leftSum[i] = leftTempSum;
            leftTempSum += nums[i];
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            rightSum[i] = rightTempSum;
            rightTempSum += nums[i];
        }

        for (int i = 0; i < ans.length; i++) {
            ans[i] = Math.abs(leftSum[i] - rightSum[i]);
        }

        return ans;
    }
}
