class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st = new Stack<>();
        for (String ops : operations) {
            if (ops.equals("C")) {
                st.pop();
            }
            else if (ops.equals("+")) {
                int a = st.pop();
                int b = st.pop();
                st.push(b);
                st.push(a);
                st.push(a + b);
            }
            else if (ops.equals("D")) {
                st.push(st.peek() * 2);
            }
            else {
                st.push(Integer.parseInt(ops));
            }
        }

        int total = 0;
        while (!st.isEmpty()) {
            total += st.pop();
        }

        return total;
    }
}