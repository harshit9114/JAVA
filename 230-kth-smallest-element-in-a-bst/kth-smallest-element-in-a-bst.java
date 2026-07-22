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
    public void order(TreeNode n,ArrayList<Integer>l){
        if(n==null){
            return;
        }
        order(n.left,l);
        l.add(n.val);
        order(n.right,l);
        return;
    }
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> l = new ArrayList<>();
        order(root,l);
        int ans=0;
        for(int i=0;i<=k-1;i++){
            ans=l.get(i);
        }
        return ans;
    }
}