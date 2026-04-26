class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<t.length();i++){
            map.put(t.charAt(i),map.getOrDefault(t.charAt(i),0)+1);
        }
        int low=0;
        int high=0;
        int start=0;
        int min=1000000;
        char [] c= s.toCharArray();
        HashMap<Character,Integer> efg = new HashMap<>();
        while(high<c.length){
            efg.put(c[high],efg.getOrDefault(c[high],0)+1);
            while(have(map,efg)){
                int length=high-low+1;
                if(length<min){
                    min=length;
                    start=low;
                }
                int f= efg.get(c[low]);
                f--;
                if(f==0){
                    efg.remove(c[low]);
                }
                else{
                    efg.put(c[low],f);
                }
            
            low++;
            }
            high++;
         }
        if(min==1000000){
            return "";
        }
         return s.substring(start,start+min);
    }
    public Boolean have( HashMap<Character,Integer> map,HashMap<Character,Integer> efg ){
     for(Character key:map.keySet()){
        if(!efg.containsKey(key)){
            return false;
        }
        if(efg.get(key)<map.get(key)){
            return false;
        }
     }
        return true;
    }
}