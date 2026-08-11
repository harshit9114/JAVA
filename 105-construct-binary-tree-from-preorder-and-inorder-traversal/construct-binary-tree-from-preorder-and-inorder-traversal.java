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
    int idx=0;
    public int search(int [] inorder, int val,int left,int right){
        for(int i=0;i<inorder.length;i++){
        if(inorder[i]==val){
            return i;
        }    
        }
        return -1;
    }
    public TreeNode build(int [] preorder, int[] inorder, int left, int right){;
        if(left>right){
            return null;
        }
           TreeNode root  = new TreeNode(preorder[idx]);
        int index=search(inorder, preorder[idx],left,right);
        idx++;
        root.left=build( preorder,inorder,left,index-1);
        root.right=build(preorder,inorder,index+1,right);
        return root;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,inorder,0,inorder.length-1);
        
    }
}