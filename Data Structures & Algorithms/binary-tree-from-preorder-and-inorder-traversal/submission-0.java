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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int m = preorder.length;
        int n = inorder.length;
        return helper(preorder,0, m-1,inorder, 0, n-1);
    }

    public TreeNode helper(int []preorder, int psi, int pei, int []inorder, int isi, int iei){
        if(isi>iei){
            return null;
        }
        TreeNode root = new TreeNode(preorder[psi]);
        int idx=0;
        for(int i=isi; i<=iei; i++){
            if(inorder[i] == preorder[psi]){
                idx=i;
                break;
            }
        }
        int count = idx-isi;
        root.left = helper(preorder, psi+1, psi+count,inorder, isi, idx-1);
        root.right = helper(preorder, psi+count+1,pei,inorder, idx+1, iei);
        return root;
    }
}
