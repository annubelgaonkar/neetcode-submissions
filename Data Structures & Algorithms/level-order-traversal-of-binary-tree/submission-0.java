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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){
            return new ArrayList<>();
        }
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> ans = new ArrayList<>();
        q.add(root);

        while(q.size()>0){
            int size=q.size();
            List<Integer> al = new ArrayList<>();
            for(int i=0; i<size; i++){
                TreeNode rem = q.poll();
                al.add(rem.val);
                if(rem.left!=null)  q.add(rem.left);
                if(rem.right != null)   q.add(rem.right);
            }
            ans.add(al);
        }
        return ans;        
    }
}
