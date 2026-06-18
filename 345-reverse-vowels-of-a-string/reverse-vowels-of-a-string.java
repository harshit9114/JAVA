class Solution {
    public String reverseVowels(String s) {
        char [] c=s.toCharArray();
        int i=0;
        int j= c.length-1;
        while(i<j){
            char s1=s.charAt(i);
            char s2=s.charAt(j);
            if((s1=='a'||s1=='e'||s1=='i'||s1=='o'||s1=='u'||s1=='A'||s1=='E'||s1=='I'||s1=='O'||s1=='U') && (s2=='a'||s2=='e'||s2=='i'||s2=='o'||s2=='u'||s2=='A'||s2=='E'||s2=='I'||s2=='O'||s2=='U')){
                char t= c[i];
                c[i]=c[j];
                c[j]=t;
                i++;
                j--;
            }
            else if((s1=='a'||s1=='e'||s1=='i'||s1=='o'||s1=='u'||s1=='A'||s1=='E'||s1=='I'||s1=='O'||s1=='U') && (s2!='a'||s2!='e'||s2!='i'||s2!='o'||s2!='u'||s2!='A'||s2!='E'||s2!='I'||s2!='O'||s2!='U')){
                j--;
            }
            else{
                i++;
            }
        }
        return new String(c);
    }
}