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
    public void order(TreeNode n,ArrayList<Integer> l){
        if(n==null){
            return;
        }
        l.add(n.val);
        order(n.left,l);
        order(n.right,l);
        return;
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        ArrayList<Integer> l= new ArrayList<>();
        order(root,l);
        return l;
        
    }
}