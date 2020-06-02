package jianzhiOffer;

public class Solution28_1 {

    public boolean isSymmetric(TreeNode root) {

        if(root == null) return true;
        return helper(root.left, root.right);
    }

    private boolean helper(TreeNode left, TreeNode right) {

        if(left == null && right == null) return true;
        if(left == null || right == null) return false;
        if(left.val == right.val)
            return helper(left.left, right.right) && helper(left.right, right.left);
        return false;
    }
}
