class Solution {
    public int totalFruit(int[] fruits) {
        int low=0;
        int high=0;
        int result=Integer.MIN_VALUE;
        int sum=0;
        if(fruits.length==1){
            return 1;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        while(high<fruits.length){
            map.put(fruits[high],map.getOrDefault(fruits[high],0)+1);
            while(map.size()>2){
                int f=map.get(fruits[low]);
                f--;
                if(f==0){
                    map.remove(fruits[low]);
                }
                else{
                    map.put(fruits[low],f);
                }
                low++;
            }
          
                int len= high-low+1;
                result=Math.max(result,len);
            
            high++;
        }
        return result;   
    }
}