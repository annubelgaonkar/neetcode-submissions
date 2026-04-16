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
    int ans = 0;
    int count=0;
    public int kthSmallest(TreeNode root, int k) {
        helper(root,k);
        return ans;
    }

    public void helper(TreeNode A, int k){
        if(A==null){
            return;
        }
        helper(A.left,k);
        if(count<k){
            count++;
            ans=A.val;
        }
        helper(A.right,k);
    }
}
