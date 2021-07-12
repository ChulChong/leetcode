class problem1464 {

    public static void main(String[] args) {
        int[] dd = {10, 2, 5, 2};
        System.out.println(maxProduct(dd));
    }

    public static int maxProduct(int[] nums) {
        int max = 1;
        int secondMax = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= max) {
                secondMax = max;
                max = nums[i];
            } else if (nums[i] != max && nums[i] > secondMax) {
                secondMax = nums[i];
            }
        }

        return (max - 1) * (secondMax - 1);
    }
}
