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
    int ans=1578465;
    public void order(TreeNode n, int count){
        if(n==null) return ;
        count++;
        if(n.left==null && n.right==null){
            ans=Math.min(count,ans);
        }
        order(n.left,count);
        order(n.right,count);
    }
    public int minDepth(TreeNode root) {
        int count=0;
        if(root==null) return 0;
        order(root,count);
        return ans;
    }
}