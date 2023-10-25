import com.sun.source.tree.Tree;

public class Problem110 {
    public static void main(String[] args) {
        TreeNode n15 = new TreeNode(15);
        TreeNode n7 = new TreeNode(7);
        TreeNode n20 = new TreeNode(20, n15, n7);
        TreeNode n9 = new TreeNode(9);
        TreeNode root = new TreeNode(3, n9, n20);
        System.out.println(isBalanced(root));
    }

    public static boolean isBalanced(TreeNode root) {

        return heightCount(root) != -1;
    }

    public static int heightCount(TreeNode root) {
        if (root == null) return 0;

        int leftHeight = heightCount(root.left);
        int rightHeight = heightCount(root.right);

        if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) return -1;
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
