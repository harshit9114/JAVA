class Solution {
    public boolean isValid(String s) {
        if (s.length() <= 1) {
            return false;
        }
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
     
             if (c == ']') {
                if (!st.isEmpty() && st.peek() == '[') {
                    st.pop();
                } else {
                    return false; 
                }
            } else if (c == '}') {
                if (!st.isEmpty() && st.peek() == '{') {
                    st.pop();
                } else {
                    return false;
                }
            } else if (c == ')') {
                if (!st.isEmpty() && st.peek() == '(') {
                    st.pop();
                } else {
                    return false;
                }
            }
            else{
                st.push(c);
            }
        }
        return st.isEmpty();
    }
}
