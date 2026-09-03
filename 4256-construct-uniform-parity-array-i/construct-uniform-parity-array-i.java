class Solution {
    public boolean uniformArray(int[] nums1) {

        int[] nums2 = new int[nums1.length];

        boolean odd = false;
        boolean even = false;

        // First option for nums2[0]
        nums2[0] = nums1[0];

        if (nums2[0] % 2 == 0) {
            even = true;
        } else {
            odd = true;
        }

        // Second option for nums2[0]
        for (int j = 1; j < nums1.length; j++) {

            nums2[0] = nums1[0] - nums1[j];

            if (nums2[0] % 2 == 0) {
                even = true;
            } else {
                odd = true;
            }
        }

        // Check remaining elements
        for (int i = 1; i < nums1.length; i++) {

            boolean found = false;

            for (int j = 0; j < nums1.length; j++) {

                if (i == j) {
                    continue;
                }

                // First option: nums2[i] = nums1[i]
                if (even && nums1[i] % 2 == 0) {
                    found = true;
                }

                if (odd && nums1[i] % 2 != 0) {
                    found = true;
                }

                // Second option: nums2[i] = nums1[i] - nums1[j]
                if (even && (nums1[i] - nums1[j]) % 2 == 0) {
                    found = true;
                }

                if (odd && (nums1[i] - nums1[j]) % 2 != 0) {
                    found = true;
                }
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }
}