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
    ArrayList<String > l = new ArrayList<>();
    ArrayList<Integer> a= new ArrayList<>();
    public void order(TreeNode n){
        if(n==null) return;
       a.add(n.val);
        if(n.left==null && n.right==null){
               String s="";
               for(int i=0;i<a.size();i++){
                s+=String.valueOf(a.get(i));
                if(i!=a.size()-1){
                    s+="->";
                }
               }
               l.add(s);
            }
        order(n.left);
        order(n.right);
        a.remove(a.size()-1);
    
    }
    public List<String> binaryTreePaths(TreeNode root) {
        order(root);
        return l;
        
    }
}