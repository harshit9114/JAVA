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
    ArrayList<Integer> l = new ArrayList<>();
    public void order(TreeNode n){
        if(n==null) return;
        order(n.left);
        l.add(n.val);
        order(n.right);
        return;
      
    }
    public boolean isValidBST(TreeNode root) {
       boolean flag= true;
        order(root);
        for(int i=0;i<l.size();i++){
            if(i>0 && l.get(i)<=l.get(i-1)){
                flag=false;
                break;
            }
        }
        return flag;
    }
}