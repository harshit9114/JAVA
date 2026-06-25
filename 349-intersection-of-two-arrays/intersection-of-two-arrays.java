class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> l= new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums2[j]==nums1[i]){
                    l.add(nums1[i]);
                
                }
            }
        }
        HashSet<Integer> unique= new HashSet<>(l);
int[] result = new int[unique.size()];
int i=0;
for(int val:unique){
    result[i++]=val;
}
return result;
        
    }
}