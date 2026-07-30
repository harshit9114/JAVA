class Solution {
    public int minimumPushes(String word) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        ArrayList<Integer> l = new ArrayList<>();
        for(int x : map.values()){
            l.add(x);
        }
        Collections.sort(l, Collections.reverseOrder());
        int sum = 0;
        for(int i=0;i<l.size();i++){
            if(i<8)
                sum += l.get(i);
            else if(i<16)
                sum += l.get(i)*2;
            else if(i<24)
                sum += l.get(i)*3;
            else
                sum += l.get(i)*4;
        }
        return sum;
    }
}