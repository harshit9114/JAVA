class Solution {
    public boolean isHappy(int n) {
        
        int es= n*n;
        while(true){
            int sum=0;
            while(n!=0){
                int r= n%10;
                sum=sum+r*r;
                n=n/10;
            }
            n=sum;
            if(n==1){
                return true;
            }
            else if(n==4){
                return false;
            }
        }

    }
}