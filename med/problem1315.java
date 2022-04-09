

class problem1315 {

    private static int sum;

    public static void main(String[] args) {
        TreeNode first = new TreeNode(6);
        TreeNode second = new TreeNode(7);
        TreeNode third = new TreeNode(8);
        TreeNode fourth = new TreeNode(2);
        TreeNode fifth = new TreeNode(7);
        TreeNode sixth = new TreeNode(1);
        TreeNode seventh = new TreeNode(3);
        TreeNode eighth = new TreeNode(9);
        TreeNode ninth = new TreeNode(1);
        TreeNode tenth = new TreeNode(4);
        TreeNode eleventh = new TreeNode(5);
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        fourth.left = eighth;
        fifth.left = sixth;
        fifth.right = tenth;
        third.left = ninth;
        third.right = seventh;
        seventh.right = eleventh;

        System.out.println(sumEvenGrandparent(first));
    }


    public static int sumEvenGrandparent(TreeNode root) {
        if (root == null) return 0;
        grandParentdfs(root, null, null);
        return sum;

    }

    public static void grandParentdfs(TreeNode root, TreeNode parent, TreeNode grandParent) {
        if (root == null) return;

        if (grandParent != null && grandParent.val % 2 == 0) {
            sum += root.val;
        }
        if (root.left != null) {
            grandParentdfs(root.left, root, parent);
        }
        if (root.right != null) {
            grandParentdfs(root.right, root, parent);
        }
    }
}

