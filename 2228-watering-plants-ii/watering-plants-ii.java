class Solution {
    public int minimumRefill(int[] plants, int A, int B) {
        int i=0;
        int j= plants.length-1;
        int count=0;
        int count1=0;
        int f=A;
        int g=B;
        while(i<j){
            if(plants[i]<=A){
                A-=plants[i];
                i++;
            }
            else if(plants[i]>A){
                count++;
                A=f;
                A-=plants[i];
                i++;
            }
            if(plants[j]<=B){
                B-=plants[j];
                j--;
            }
            else if(plants[j]>B){
                count1++;
                B=g;
                B-=plants[j];
                j--;
            }
             if(i==j){
                int maxwater= Math.max(A,B);
                if(maxwater<plants[i]){
                    count++;
                }
                }
        }
        return count+count1;
    }
}