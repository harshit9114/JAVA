
class Solution {
    public List<String> summaryRanges(int[] nums) {
        ArrayList<String> rer = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int start = nums[i];
            int[] res = new int[nums.length - i];
            for (int k = 0; k < res.length; k++) {
                res[k] = start + k;
            }
            int j = 0;
            while (i < nums.length && nums[i] == res[j]) {
                i++;
                j++;
            }

            int end = nums[i - 1];
            String s = String.valueOf(start);
            String t = String.valueOf(end);
            if (s.equals(t)) {
                rer.add(s);
            } else {
                rer.add(s + "->" + t);
            }
        }
        return rer;
    }
}