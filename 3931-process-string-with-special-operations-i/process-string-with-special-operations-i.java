class Solution {
    public String processStr(String s) {
        StringBuilder res= new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                res.append(s.charAt(i));
            }
            else if(s.charAt(i)=='*'){
                if(res.length()>0){
                res.deleteCharAt(res.length()-1);
            }
            }
            else if(s.charAt(i)=='#'){
                res.append(res);
            }
            else if(s.charAt(i)=='%'){
                res.reverse();
            }
        }
        return new String(res);
        
    }
}