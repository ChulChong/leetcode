class problem1365 {
  public int[] smallerNumbersThanCurrent(int[] nums) {
    int[] dd = new int[nums.length];
    for (int i = 0; i < nums.length; i++) {
      int count = 0;

      for (int j = 0; j < nums.length; j++) {
        if (nums[i] > nums[j]) {
          count++;
        }
      }
      dd[i] = count;
    }
    return dd;
  }
}
