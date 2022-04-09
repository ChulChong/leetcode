
public class Problem1302 {

    public static void main(String[] args) {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode seventh = new TreeNode(7);
        TreeNode eighth = new TreeNode(8);
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        fourth.left = seventh;
        third.right = sixth;
        sixth.right = eighth;

        System.out.println(deepestLeavesSum(first));

    }

    private static int maxLevel = 0;
    private static int sum = 0;

    public static int deepestLeavesSum(TreeNode root) {

        if (root == null) return 0;
        calculateLevel(root, 0);
        return sum;
    }

    public static void calculateLevel(TreeNode root, int level) {
        if (root == null) return;

        if (level > maxLevel) {
            sum = 0;
            maxLevel = level;
        }
        if (level == maxLevel) {
            sum = sum + root.val;
        }

        calculateLevel(root.left, level + 1);
        calculateLevel(root.right, level + 1);

    }

}
