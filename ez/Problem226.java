public class Problem226 {
    public static void main(String[] args) {
        TreeNode n1 = new TreeNode(1);
        TreeNode n3 = new TreeNode(3);
        TreeNode n2 = new TreeNode(2, n1, n3);
        TreeNode n6 = new TreeNode(6);
        TreeNode n9 = new TreeNode(9);
        TreeNode n7 = new TreeNode(7, n6, n9);
        TreeNode root = new TreeNode(4, n2, n7);

        invertTree(root).print();

        //https://leetcode.com/problems/invert-binary-tree/description/
    }

    public static TreeNode invertTree(TreeNode root) {
        if(root == null) return null;
        TreeNode tmp = new TreeNode(0);
        tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
