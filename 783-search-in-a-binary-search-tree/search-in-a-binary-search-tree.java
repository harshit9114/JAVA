// /**
//  * Definition for a binary tree node.
//  * public class TreeNode {
//  *     int val;
//  *     TreeNode left;
//  *     TreeNode right;
//  *     TreeNode() {}
//  *     TreeNode(int val) { this.val = val; }
//  *     TreeNode(int val, TreeNode left, TreeNode right) {
//  *         this.val = val;
//  *         this.left = left;
//  *         this.right = right;
//  *     }
//  * }
//  */
// class Solution {
//     ArrayList<Integer> l = new ArrayList<>();
//     public void order(TreeNode n, int val){
//         if(n==null){
//             return;
//         }
//         if(n== val){
//             l.add(n.val);
//             if(n.left!=null){
//                 l.add(n.left);
//             }
//             if(n.right!=null){
//                 l.add(n.right);
//             }
//         }
//         order(n.left,val);
//         order(n.right,val);
        
//     return;
//     }
//     public TreeNode searchBST(TreeNode root, int val) {
//         order(root, val);
        
//     }
// }









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
    public TreeNode temp;
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null)return null;
        helper(root, val);
        return temp;
    }
    public void helper (TreeNode root, int val){
        if(root==null)return;
        if(root.val==val){
            temp= root;
            return;
        }
        if(root.val>val){
            helper(root.left, val);
        }else{
            helper(root.right, val);
        }
    }
}