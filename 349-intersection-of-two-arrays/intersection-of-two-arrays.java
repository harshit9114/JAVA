import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> result = new HashSet<>();
        for(int num : nums1){
            set1.add(num);
        }
        for(int nums : nums2){
            if(set1.contains(nums)){
                result.add(nums);
            }
        }
        int[] ans = new int[result.size()];
        int i = 0;

        for(int num : result){
            ans[i++] = num;
        }

        return ans;
    }
}