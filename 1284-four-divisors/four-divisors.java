class Solution {
    public int sumFourDivisors(int[] nums) {
        int total=0;
        for(int num:nums)
        {
            int sum=num;
            int count=1;
            for(int i=1;i<num;i++)
            {
                if(num%i==0)
                {
                    count++;
                    sum+=i;
                }
                if(count>4)
                {
                    break;
                }
            }
            if(count==4)
            {
                total+=sum;
            }
        }
        return total;
    }
}