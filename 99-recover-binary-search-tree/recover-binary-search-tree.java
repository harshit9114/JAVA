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
    int index=0;
    public void order(TreeNode root){
        if(root==null) return;
        order(root.left);
        l.add(root.val);
        order(root.right);
    }
    public void rewrite(TreeNode root){
        if(root==null) return;
        rewrite(root.left);
        root.val = l.get(index++);
        rewrite(root.right);
    }
    public void recoverTree(TreeNode root) {
        order(root);
        int firstgalat=0;
        int firstsgalat=0;
        int secondgalat=0;
        int secondsgalat=0;
        int galat=0;
        for(int i=0;i<l.size()-1;i++){
            if(l.get(i)>l.get(i+1)) {galat++;
            if(galat==1){
                 firstgalat=i;
                firstsgalat=i+1;
            }
            else {
                 secondgalat=i;
         secondsgalat=i+1;
            }
        }
        }
        if(galat==2){
            int temp= l.get(firstgalat);
            l.set(firstgalat,l.get(secondsgalat));
             l.set(secondsgalat,temp);
        }
        else if(galat==1){
             int temp= l.get(firstgalat);
            l.set(firstgalat,l.get(firstsgalat));
             l.set(firstsgalat,temp);
        }
        rewrite(root);    
    }
}