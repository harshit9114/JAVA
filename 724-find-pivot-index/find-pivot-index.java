class Solution {
    public int pivotIndex(int[] nums) {
        int ans=-1;
        int index=0;
        int sum=0;
        int sum1=0;
            for(int i=0;i<nums.length;i++){
                index=i;
                for(int j=0;j<index;j++){
                    sum+=nums[j];
                }
                for(int f=index+1;f<nums.length;f++){
                    sum1+=nums[f];
                }
            if(sum==sum1){
                ans=index;
                break;
            }
            else{
                ans=-1;
                index=0;
                sum=0;
                sum1=0;
            }
            }
        return ans;
    }
}