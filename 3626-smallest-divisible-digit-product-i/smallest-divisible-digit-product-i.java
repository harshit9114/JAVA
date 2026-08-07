class Solution {
    public int smallestNumber(int n, int t) {
        int ans=-1;
         int x=n;
    while(true){
        int product=1;
      while(n!=0){
        int rem=n%10;
        product*=rem;
        n=n/10;
      }
        if(product%t==0){
            ans=x;
            break;
        }
        n=x+1;
        x=n;
    }
        return ans;
    }
}