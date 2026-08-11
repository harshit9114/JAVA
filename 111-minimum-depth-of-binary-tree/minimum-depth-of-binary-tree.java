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
    int max=0;
    public void order(TreeNode n,int count){
        if( n==null) return;
        count++;
        if(n.left==null && n.right==null){
         if(max==0){   max=count;
         }
         else{
         max= Math.min(count,max);
        }
        }
       order(n.left,count);
       order(n.right,count);
       return;
    }
    public int minDepth(TreeNode root) {
     order(root,0);
     return max;   
    }
}