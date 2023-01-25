public class Problem2535 {
    public static void main(String[] args) {
        int[] nums = {1, 15, 6, 3};

        System.out.println(differenceOfSum(nums));

        //https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/
    }

    public static int differenceOfSum(int[] nums) {
        int elementSums = 0;
        int digitSums = 0;

        for (int i : nums) {
            elementSums += i;
            while (i != 0) {
                digitSums += i % 10;
                i /= 10;
            }
        }
        return elementSums - digitSums;

    }
}
