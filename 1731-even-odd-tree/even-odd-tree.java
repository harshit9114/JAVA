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
    public boolean isEvenOddTree(TreeNode root) {
        int count=0;
        Queue<TreeNode> q= new LinkedList<>();
        if(root==null){
            return true;
        }
        q.add(root);
        while(!q.isEmpty()){
            ArrayList<Integer> l= new ArrayList<>();
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
            if(count%2==0){
                for(int i=0;i<l.size();i++){
                     if(l.get(i)%2==0){
                                return false;
                        }
                    if(i>0 && l.get(i-1)>=l.get(i)){
                        return false;
                    }
                }
            }
                if(count%2!=0){
                     for(int i=0;i<l.size();i++){
                        if(l.get(i)%2!=0){
                                return false;
                        }
                    if(i>0 && l.get(i-1)<=l.get(i)){
                        return false;
                    }
                }
                }
                count++;
            }
            return true;
        }
        
    }
