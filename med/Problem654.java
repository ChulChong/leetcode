public class Problem654 {

    //https://leetcode.com/problems/maximum-binary-tree/

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 6, 0, 5};

        System.out.println(constructMaximumBinaryTree(nums));
    }

    public static TreeNode constructMaximumBinaryTree(int[] nums) {
        return construct(nums, 0, nums.length);
    }

    public static TreeNode construct(int[] nums, int l, int r) {
        if (l == r)
            return null;
        int max_i = max(nums, l, r); //3
        TreeNode root = new TreeNode(nums[max_i]);
        root.left = construct(nums, l, max_i);
        root.right = construct(nums, max_i + 1, r);
        return root;
    }

    public static int max(int[] nums, int l, int r) {
        int max_i = l;
        for (int i = l; i < r; i++) {
            if (nums[max_i] < nums[i])
                max_i = i;
        }
        return max_i;
    }
}
