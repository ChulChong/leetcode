import java.util.*;

public class Problem347 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }

    //Using Bucket sorting
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i : nums) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int key : hm.keySet()) {
            int freq = hm.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }


        int[] result = new int[k];
        int count = 0;
        for (int i = nums.length; i >= 0 && count < k; i--) {
            if (bucket[i] != null) {
                for (int n : bucket[i]) {
                    result[count++] = n;
                    if (count == k) break;
                }
            }
        }

        return result;

    }

    //Using MaxHeap
    /*
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int i : nums) {
            hm.put(i, hm.getOrDefault(i, 0) + 1);
        }
        Queue<Integer> heap = new PriorityQueue<>((a, b) -> hm.get(b) - hm.get(a));
        for (int key : hm.keySet()) {
            heap.add(key);
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = heap.poll();
        }

        return result;

    }*/


}
