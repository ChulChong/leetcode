public class Problem112 {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5,
                new TreeNode(4,
                        new TreeNode(11,
                                new TreeNode(7),
                                new TreeNode(2)
                        ),
                        null
                ),
                new TreeNode(8,
                        new TreeNode(13),
                        new TreeNode(4)
                )
        );
        int targetSum = 22;

        System.out.println(hasPathSum(root, targetSum));

    }

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;

        if (root.left == null && root.right == null) {
            return root.val == targetSum;
        }
        int nextTarget = targetSum - root.val;
        return hasPathSum(root.left, nextTarget) || hasPathSum(root.right, nextTarget);
    }
}
