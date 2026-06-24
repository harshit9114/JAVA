class Solution {
    public int timeRequiredToBuy(int[] arr, int k) {
        int count=0;
        while(arr[k]!=0){
            for(int i=0;i<arr.length;i++){
                if(arr[i]>=1){
                    arr[i]-=1;
                    count++;
                }
                if(arr[k]==0) return count;
            }
        }
        return count;
        
    }
}