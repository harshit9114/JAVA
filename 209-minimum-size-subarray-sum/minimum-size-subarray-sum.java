class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int result=Integer.MAX_VALUE;
        int low=0;
        int high=0;
        int sum=0;
        int r=0;
         while(high<nums.length){
            sum+=nums[high];
            while(sum>=target){
                 int length= high-low+1;
                result=Math.min(result,length);
                sum-=nums[low];
                low++;
            }
            high++;
         }
         for(int i=0;i<nums.length;i++){
            r+=nums[i];
         }
          if(r<target){
                return 0;
            }
        return result;
    }
}