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
    int sum;
    public void order(TreeNode n, boolean flag){
        if(n==null){
            return;
        }
        if(n.left==null && n.right== null && flag==true){
            sum+=n.val;
        }
        order(n.left,true);
        order(n.right,false);
    }
    public int sumOfLeftLeaves(TreeNode root) {
       boolean flag= false;
        order(root,flag);
        return sum;
    }
}