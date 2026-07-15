class Solution {
    public int characterReplacement(String s, int k) {
        int low=0;
        int high=0;
        int ans=0;
         HashMap<Character,Integer> map = new HashMap<>();
        while(high<s.length()){
            map.put(s.charAt(high),map.getOrDefault(s.charAt(high),0)+1);
            int length= high-low+1;
            int f=find(map);
            int diff= length-f;
            while(diff>k){
                int a= map.get(s.charAt(low));
                a--;
                if(a==0){
                    map.remove(s.charAt(low));
                }
                else{
                    map.put(s.charAt(low),a);
                }
                low++;
                 length= high-low+1;
             f=find(map);
             diff= length-f;
            }
             length= high-low+1;
            ans=Math.max(ans,length);
            high++;
        }
        return ans;
    }
        public int find(HashMap<Character,Integer> map){
            int max=0;
            for(int x: map.values()){
                max=Math.max(max,x);
            }
            return max;
        }
        }
