public class Problem543 {
    public static void main(String[] args) {
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n2 = new TreeNode(2, n4, n5);
        TreeNode n3 = new TreeNode(3);
        TreeNode root = new TreeNode(1, n2, n3);
        System.out.println(diameterOfBinaryTree(root));
        //https://leetcode.com/problems/diameter-of-binary-tree/
    }

    public static int diameterOfBinaryTree(TreeNode root) {

        if (root == null) return 0;
        int diameter = 0;

        traversalTree(root, diameter);

        return diameter;
    }

    public static int traversalTree(TreeNode root, int diameter) {

        if (root == null) return -1;
        int leftPath = traversalTree(root.left, diameter);
        int rightPath = traversalTree(root.right, diameter);

        return 1 + Math.max(leftPath, rightPath);
    }
}
