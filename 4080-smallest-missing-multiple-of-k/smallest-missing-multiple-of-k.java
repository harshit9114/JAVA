class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
       int j=1;
       while(true){
        int multiple=k*j;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==multiple){
            break;
        }
        else if(nums[i]!=multiple && i==nums.length-1){
           return multiple;
        }
       }
       j++;
       }
 
    }
}