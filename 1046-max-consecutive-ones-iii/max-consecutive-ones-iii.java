class Solution {
    public int longestOnes(int[] nums, int k) {
        int max=0;
        int zeros=0;
        int left=0;
        int count=0;
        for(int right=0 ; right<nums.length ; right++){
            if(nums[right]==0){
                zeros++;
            }
            while(zeros>k){
                if(nums[left]==0) zeros--;
                left++;
                
            }
            count=right-left+1;
            max=Math.max(max,count);
        }
        return max;
    }

}