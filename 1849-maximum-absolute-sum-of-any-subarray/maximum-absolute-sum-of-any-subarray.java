class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int best=nums[0];
       int bestneg= nums[0];
       int re=0;
        int ans=nums[0];
        for(int i=1;i<nums.length;i++){
            int v1=(best+nums[i]);
            int v2=(nums[i]);
            int v3= (bestneg+nums[i]);
            best=Math.max(v1,Math.max(v3,v2));
            bestneg= Math.min(v1,Math.min(v2,v3));
            re=Math.max(best,Math.abs(bestneg));
            ans=Math.max(re,ans);
        }
        return Math.abs(ans);

    }
}