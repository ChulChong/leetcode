class problem1315 {


    public static void main(String[] args) {
    }

    int sum = 0;

    public int sumEvenGrandparent(TreeNode root) {
        if (root == null) {
            return 0;
        }
        isGrandParentEven(null, root, root.left);
        isGrandParentEven(null, root, root.right);
        return sum;
    }

    public void isGrandParentEven(TreeNode grandParent, TreeNode parent, TreeNode current) {
        if (current == null) {
            return;
        }
        isGrandParentEven(parent, current, current.left);
        isGrandParentEven(parent, current, current.right);
        if (grandParent == null && grandParent.val % 2 == 0) {
            sum = current.val + sum;
        }
    }

}
}
