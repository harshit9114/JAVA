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
    public void order(TreeNode n,int sum){
        if(n==null) return;
        sum=sum*10+n.val;
        if(n.left==null && n.right==null){
            res+=sum;
        }
        order(n.left,sum);
        order(n.right,sum);
    }
    public int sumNumbers(TreeNode root) {
        int sum=0;
     order(root,sum);
     return res;
        
    }
}