class Solution {
    public int romanToInt(String s) {
        int n=0;
        char []c=s.toCharArray();
        HashMap<Character,Integer> map= new HashMap<>();
         map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        for(int i=0;i<c.length;i++){
           if( i+1<c.length && map.get(c[i])<map.get(c[i+1])  ){
            n+=map.get(c[i+1])-map.get(c[i]);
            i++;
           }
           else{
            n+=map.get(c[i]);
           }
        }
        return n;
    }
}