/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> q= new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        if(root==null){
            return res;
        }
        q.add(root);
        while(!q.isEmpty()){
          int lvlsize=q.size();
          List<Integer> l = new ArrayList<>();
          while(lvlsize!=0){
        Node t= q.poll();
          l.add(t.val);
        if (t.children != null) {
            for (Node child : t.children) {
            if (child != null) {
                q.add(child);
         }
        }
        }
        lvlsize--;
            }
        res.add(l);
        }
        return res;
    }
}