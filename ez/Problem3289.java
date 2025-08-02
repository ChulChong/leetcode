import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Problem3289 {
    public static void main(String[] args) {
        int[] nums = {0,1,0,1};
        System.out.println(Arrays.toString(getSneakyNumbers(nums)));
    }

    public static int[] getSneakyNumbers(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int[] ans = new int[2];
        for(int i = 0; i < nums.length; i++){
            if(hs.contains(nums[i])){
                ans[i] = nums[i];
            }else{
                hs.add(nums[i]);
            }
        }
        return ans;
    }
}
