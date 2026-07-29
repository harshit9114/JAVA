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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q= new LinkedList<>();
        if(root==null) return res;
        q.add(root);
        while(!q.isEmpty()){
            ArrayList<Integer> l = new ArrayList<>();
            int lvl= q.size();
            while(lvl!=0){
                TreeNode t= q.poll();
                l.add(t.val);
                if(t.left!=null){
                    q.add(t.left);
                }
                if(t.right!=null){
                    q.add(t.right);
                }
                lvl--;
            }
            res.add(l); 
                    }
                    Collections.reverse(res);
                    return res;
        
    }
}