import java.util.HashMap;


public class Problem235 {
    public static void main(String[] args) {
        TreeNode n3 = new TreeNode(3);
        TreeNode n5 = new TreeNode(5);
        TreeNode n4 = new TreeNode(4, n3, n5);
        TreeNode n0 = new TreeNode(0);
        TreeNode n2 = new TreeNode(2, n0, n4);
        TreeNode n7 = new TreeNode(7);
        TreeNode n9 = new TreeNode(9);
        TreeNode n8 = new TreeNode(8, n7, n9);
        TreeNode root = new TreeNode(6, n2, n8);

        System.out.println(lowestCommonAncestor(root, n2, n8));


    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null) return null;
        if (p.val < root.val && q.val < root.val) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (p.val > root.val && q.val > root.val) {
            return lowestCommonAncestor(root.right, p, q);
        }else return root;

    }


}
