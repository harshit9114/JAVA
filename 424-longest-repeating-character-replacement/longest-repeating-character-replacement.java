class Solution {
    public int characterReplacement(String s, int k) {
        int high=0;
        int low=0;
        int result=Integer.MIN_VALUE;
        char c[] = s.toCharArray();
        HashMap<Character,Integer> map= new HashMap<>();
        while(high<c.length){
            map.put(c[high],map.getOrDefault(c[high],0)+1);
            int len=high-low+1;
            int f=find(map);
            int diff=len-f;
            while(diff>k){
                int a=map.get(c[low]);
                a--;
                if(a==0){
                    map.remove(c[low]);
                }
                else{
                    map.put(c[low],a);
                }
                low++;
                f=find(map);
                len=high-low+1;
                diff=len-f;
            }
             len=high-low+1;
        result=Math.max(result,len);
            high++;
        }
        return result;
    }
    public int find(HashMap<Character,Integer> map){
        int max=0;
        for(int val:map.values()){
     max=Math.max(max,val);
        }
     return max;
    }
}