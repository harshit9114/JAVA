class Solution {
    public boolean canBeEqual(String s1, String s2) {
        char[] c= s1.toCharArray();
        char [] c2=s2.toCharArray();
        boolean flag=false;
        for(int i=0;i<c.length;i++){
            for(int j=i;j<c.length;j++){
                if(j-i==2){
                    char temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;
                }
                 if(Arrays.equals(c, c2)){
                    flag=true;
                    break;
                }
            }
        }
        for(int i=0;i<c2.length;i++){
            for(int j=i;j<c2.length;j++){
                if(j-i==2){
                    char temp=c2[i];
                    c2[i]=c2[j];
                    c2[j]=temp;
                }
                 if(Arrays.equals(c2, c)){
                    flag=true;
                    break;
                }
            }
        }
        return flag;
    }
}