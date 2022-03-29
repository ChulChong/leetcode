

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Problem1282 {
    public static void main(String[] args) {
        int[] groupSizes = {3, 3, 3, 3, 3, 1, 3};
        System.out.println(groupThePeople(groupSizes));
        //expected Output: [[5],[0,1,2],[3,4,6]]
        //Explanation:
        //The first group is [5]. The size is 1, and groupSizes[5] = 1.
        //The second group is [0,1,2]. The size is 3, and groupSizes[0] = groupSizes[1] = groupSizes[2] = 3.
        //The third group is [3,4,6]. The size is 3, and groupSizes[3] = groupSizes[4] = groupSizes[6] = 3.
        //Other possible solutions are [[2,1,6],[5],[0,4,3]] and [[5],[0,6,2],[4,3,1]].
    }

    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        List<List<Integer>> ans = new ArrayList<>();

        HashMap<Integer, List<Integer>> hm = new HashMap<>();
       
        for (int i = 0; i < groupSizes.length; i++) {
            List<Integer> sub = new ArrayList<>();
            int groupsize = groupSizes[i];

            if (hm.containsKey(groupsize)) {
                sub = hm.get(groupsize);
            }
            sub.add(i);
            hm.put(groupsize, sub);
            if (sub.size() == groupsize) {
                ans.add(sub);
                hm.remove(groupsize);
            }
        }
        return ans;
    }
}
