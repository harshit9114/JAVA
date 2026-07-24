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
    public long kthLargestLevelSum(TreeNode root, int k) {
        Queue<TreeNode> q = new LinkedList<>();
        ArrayList<Long> res =  new ArrayList<>();
        q.add(root);
        while(!q.isEmpty()){
            int lvl= q.size();
            ArrayList<Long> l = new ArrayList<>();
            long sum=0;
            while(lvl!=0){
                TreeNode t= q.poll();
                l.add((long)t.val);
                if(t.left!=null){
                    q.add(t.left);
                }
                if(t.right!=null){
                    q.add(t.right);
                }
                lvl--;
            }
            for(long x:l){
                sum+=x;
            }
            res.add(sum);
        }
    Collections.sort(res);
    if(res.size()<k){
        return -1;
    }
    return  res.get(res.size()-k);
        
    }
}