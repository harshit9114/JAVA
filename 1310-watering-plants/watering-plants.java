class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int steps=0;
        int cap= capacity;
        for(int i=0;i<plants.length;i++){
            if(plants[i]>capacity){
                steps+=i;
                steps+=(i+1)-1;
                capacity=cap;
            }
            steps++;
            capacity-=plants[i];
        }
        return steps;
    }
}