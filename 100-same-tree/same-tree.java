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
     public boolean order(TreeNode n, TreeNode m ){
        if(n==null && m== null) return true;
        if(n==null || m==null) return false;
        if(n.val!=m.val) return false;
        boolean r1= order(n.left,m.left);
        boolean r2= order(n.right,m.right);
        if(r1==true && r2==true){
            return true;
        } 
        return false;
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return order(p,q);
    }
}