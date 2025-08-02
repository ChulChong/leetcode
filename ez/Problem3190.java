public class Problem3190 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        System.out.println(minimumOperations(nums));
    }

    public static int minimumOperations(int[] nums) {
        int count = 0;
        for(int i : nums){
            if((i + 1) % 3 == 0 || (i - 1) % 3 == 0){
                count++;
            }
        }
        return count;
    }
}
