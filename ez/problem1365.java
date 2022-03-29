class problem1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] dd = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int count = 0;

            for (int num : nums) {
                if (nums[i] > num) {
                    count++;
                }
            }
            dd[i] = count;
        }
        return dd;
    }
}
