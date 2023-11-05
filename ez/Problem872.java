import java.util.ArrayList;

public class Problem872 {

    //https://leetcode.com/problems/leaf-similar-trees/description/

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> al = new ArrayList<>();
        ArrayList<Integer> al2 = new ArrayList<>();


        al = findLeaves(root1, al);
        al2 = findLeaves(root2, al2);


        return al.equals(al2);
    }

    public ArrayList<Integer> findLeaves(TreeNode root, ArrayList<Integer> al) {

        if (root == null) return al;
        if (root.left == null && root.right == null) {
            al.add(root.val);
        }

        findLeaves(root.left, al);
        findLeaves(root.right, al);


        return al;
    }
}
