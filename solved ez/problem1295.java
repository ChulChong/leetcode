class problem1295 {

  public int findNumbers(int[] nums) {
    int count = 0;

    for (int i = 0; i < nums.length; i++) {
      String s = Integer.toString(nums[i]);
      if (s.length() % 2 == 0) {
        count++;
      }
    }
    return count;
  }
}
