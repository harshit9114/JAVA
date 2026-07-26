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
    public void order(TreeNode n ,String path){
        if(n==null) return;
        if(path.length()==0){ path=String.valueOf(n.val);}
        else{
        path=String.valueOf(path+"->"+n.val);
        }
        if(n.left==null && n.right==null){
                l.add(path);  
            }
        
        order(n.left,path);
        order(n.right,path);
    }
    
    public List<String> binaryTreePaths(TreeNode root) {
        String path;
        order(root,"");
        return l;
        
    }
}