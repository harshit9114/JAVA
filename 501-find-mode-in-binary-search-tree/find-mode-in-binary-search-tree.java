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
       HashSet<Integer>list = new HashSet<>();
       int max=-1309;
        HashMap<Integer,Integer> map = new HashMap<>();
        order(root,map);
         for(int i:map.values()){
            max=Math.max(max,i);
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == max){
                list.add(entry.getKey());
            }
        }
        int []arr= new int[list.size()];
        ArrayList<Integer> l1 = new ArrayList<>(list);
        for(int i =0; i<l1.size(); i++){
            arr[i]= l1.get(i);
        }
        return arr;
    }
}