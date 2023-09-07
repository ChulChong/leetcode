import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

public class Problem2733 {

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 4};
        System.out.println(findNonMinOrMax(nums));

        //https://leetcode.com/problems/neither-minimum-nor-maximum/
    }

    public static int findNonMinOrMax(int[] nums) {

        if (nums.length == 0) {
            return -1;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> al = new ArrayList<>();
        for (int i : nums) {
            if (min > i) {
                min = i;
            }
            if (max < i) {
                max = i;
            }
            al.add(i);
        }

        System.out.println(al);
        for(int i = 0; i < al.size(); i++){
            if(al.get(i) == min) al.remove(i);
            if(al.get(i) == max){
                al.remove(i);
            }
        }


        System.out.println(al);


        return -1;
    }
}
