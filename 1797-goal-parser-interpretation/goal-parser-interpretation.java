class Solution {
    public String interpret(String s) {
        StringBuilder str= new StringBuilder();
        Stack <Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            StringBuilder n = new StringBuilder ();
            if( !st.isEmpty() && st.peek()=='(' && s.charAt(i)==')'){
                n.append('o');
                while(!st.isEmpty()){
                    char c= st.pop();
                    if(c!='('){
                        n.append(c);
                    }
                }
                str.append(n.reverse());
            }
            else if(!st.isEmpty() &&  s.charAt(i)==')' && st.peek()!='('){
                while (!st.isEmpty()){
                    char c= st.pop();
                    if(c!='('){
                        n.append(c);
                    }
                }
                str.append(n.reverse());
            }
            else{
                st.push(s.charAt(i));
            }
        }
        if(!st.isEmpty()){
             StringBuilder rem = new StringBuilder();
            while (!st.isEmpty()) {
                rem.append(st.pop());
            }
            str.append(rem.reverse());
        }
        return str.toString();
  
    }
}