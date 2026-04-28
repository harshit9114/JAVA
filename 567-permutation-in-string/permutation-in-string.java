class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k=s1.length();
        boolean flag=false;
        char [] c= s1.toCharArray();
        Arrays.sort(c);
        for(int i=0;i<=s2.length()-k;i++){
               String sub=s2.substring(i,i+k);
               char [] c3= sub.toCharArray();
               Arrays.sort(c3);
                if (Arrays.equals(c,c3)){
                    flag=true;
                    break;
                }
                c3= new char[k];
            }
        return flag;
    }
}