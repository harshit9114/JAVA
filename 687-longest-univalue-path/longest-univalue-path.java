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
    int res;
    public int order(TreeNode n,int x){
        if(n==null) return  0;
        int l=order(n.left,n.val);
        int r= order(n.right,n.val);
        if (n.left == null || n.left.val != n.val)
            l = 0;
        if (n.right == null || n.right.val != n.val)
            r = 0;
        res = Math.max(res,l+r);
        return Math.max(l,r)+1;
        
    }
    public int longestUnivaluePath(TreeNode root) {
        if(root==null) return 0;
        int x=root.val;
        order(root,x);
        return res;
        
    }
}