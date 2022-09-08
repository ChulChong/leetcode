import com.sun.source.tree.Tree;

public class Problem2236 {
    public static void main(String[] args) {
        TreeNode n4 = new TreeNode(4);
        TreeNode n6 = new TreeNode(6);
        TreeNode root = new TreeNode(10, n4, n6);
        System.out.println(checkTree(root));
    }

    public static boolean checkTree(TreeNode root) {
        return root.val == root.left.val + root.right.val;
    }


}
