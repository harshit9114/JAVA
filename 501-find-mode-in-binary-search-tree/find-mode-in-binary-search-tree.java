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
    public void order(TreeNode n,HashMap<Integer,Integer> map){
        if(n==null){
            return;
        }
        map.put(n.val,map.getOrDefault(n.val,0)+1);
        order(n.left,map);
        order(n.right,map);
    }
    public int[] findMode(TreeNode root) {
        HashMap<Integer,Integer> map = new HashMap<>();
        order(root,map);
        int max=-1000;
        ArrayList<Integer> l = new ArrayList<>();
        for(int i: map.values()){
            max=Math.max(max,i);
        }
        for(Map.Entry<Integer,Integer> e: map.entrySet()){
            if(e.getValue()==max){
                l.add(e.getKey());
            }
        }
        int [] arr= new int[l.size()];
        for(int i =0;i<arr.length;i++){
            arr[i]=l.get(i);
        }
        return arr;
    }
}