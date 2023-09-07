import java.util.*;

public class Problem2610 {

    public static void main(String[] args) {
        int[] nums = {1, 3, 4, 1, 2, 3, 1};
        System.out.println(findMatrix(nums));

        //https://leetcode.com/problems/convert-an-array-into-a-2d-array-with-conditions/
    }

    public static List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();
        HashSet<Integer> hs = new HashSet<>();

        for (int i : nums) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
            hs.add(i);
        }

        while (hm.size() != 0) {
            List<Integer> curr = new ArrayList<>();
            for (int element : hs) {
                if (hm.containsKey(element)) {
                    curr.add(element);
                    if (hm.get(element) == 1) {
                        hm.remove(element);
                    } else {
                        hm.put(element, hm.get(element) - 1);
                    }
                }
            }
            ans.add(curr);
        }
        return ans;
    }
}
