class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low=0;
        int high=0;
        int max=0;
        int sum=0;
        char [] c= s.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        while(high<c.length){
            char ch= c[high];
            map.put(ch,map.getOrDefault(ch,0)+1);
            int a= map.get(ch);
            sum+=a;
         while(sum>map.size()){
            int f=map.get(c[low]);
            sum-=f;
            f--;
            if(f==0){
                map.remove(c[low]);
            }
            else{
                map.put(c[low],f);
            }
            low++;
            
         }
         if(map.size()==sum){
            max=Math.max(max,map.size());
         }
         high++;
        }
        return max;

        
    }
}