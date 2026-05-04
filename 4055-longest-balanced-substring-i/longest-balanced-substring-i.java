class Solution {
    public int longestBalanced(String s) {
        int result=Integer.MIN_VALUE;
     for(int low=0;  low<s.length();low++){
          HashMap<Character,Integer> map = new HashMap<>();
        for(int high=low; high<s.length();high++){
            map.put(s.charAt(high),map.getOrDefault(s.charAt(high),0)+1);
            if(have(map)){
                  int length=high-low+1;
                result=Math.max(length,result);
            }
            
        }
     }
        if(result==Integer.MIN_VALUE){
            return 0;
        }
            return result;
    }
    public boolean have(HashMap<Character,Integer> map){
        ArrayList<Integer> l= new ArrayList<>();
        int i=0;
        for(int val:map.values()){
            l.add(val);
        }
       int left=0;
       int right=l.size()-1;
       int target=l.get(0);
        while(left<=right){
            if(l.get(left)!=target||l.get(right)!=target){
                return false;
            }
                left++;
                right--;
            }
        return true;
       }
    }
