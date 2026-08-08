class Solution {

    ArrayList<Integer> l = new ArrayList<>();

    public void order(TreeNode n) {
        if (n == null)
            return;

        order(n.left);
        l.add(n.val);
        order(n.right);
    }

    public List<List<Integer>> closestNodes(TreeNode root, List<Integer> queries) {

        order(root);

        List<List<Integer>> temp = new ArrayList<>();

        for (int i = 0; i < queries.size(); i++) {

            int q = queries.get(i);

            int left = 0;
            int right = l.size() - 1;

            int mini = -1;
            int maxi = -1;

            while (left <= right) {

                int mid = left + (right - left) / 2;

                if (l.get(mid) == q) {

                    mini = l.get(mid);
                    maxi = l.get(mid);
                    break;

                } else if (l.get(mid) < q) {
                    mini = l.get(mid);
                    left = mid + 1;

                } else {
                    maxi = l.get(mid);
                    right = mid - 1;
                }
            }

            List<Integer> res = new ArrayList<>();
            res.add(mini);
            res.add(maxi);

            temp.add(res);
        }

        return temp;
    }
}