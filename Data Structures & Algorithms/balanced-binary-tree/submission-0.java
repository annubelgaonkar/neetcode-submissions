/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    boolean isbal = true;
    public boolean isBalanced(TreeNode root) {
        height(root);
        if(isbal==false){
            return false;
        }
        return true;
    }

    public int height(TreeNode root){
        if(root==null){
            return -1;
        }
        int l = height(root.left);
        int r = height(root.right);
        if(Math.abs(l-r) > 1){
            isbal = false;
        }
        return Math.max(l,r) + 1;
    }
}
