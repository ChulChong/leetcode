
public class Problem1038 {
    public static void main(String[] args) {
        TreeNode n3 = new TreeNode(3);
        TreeNode n8 = new TreeNode(8);
        TreeNode n2 = new TreeNode(2,null,n3);
        TreeNode n7 = new TreeNode(7,null,n8);
        TreeNode n0 = new TreeNode(0);
        TreeNode n5 = new TreeNode(5);
        TreeNode n1 = new TreeNode(1,n0,n2);
        TreeNode n6 = new TreeNode(6,n5,n7);
        TreeNode root = new TreeNode(4,n1,n6);
        printNode(bstToGst(root));
    }

    private static int sum = 0;

    public static TreeNode bstToGst(TreeNode root) {
        if (root == null) return root;
        bstToGst(root.right);
        sum += root.val;
        root.val = sum;
        bstToGst(root.left);
        return root;
    }

    public static void printNode(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.println(root.val);

        printNode(root.left);
        printNode(root.right);
    }


}
