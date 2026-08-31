import java.util.*;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashSet<Integer> set = new HashSet<>();

        // nums1 ko Set mein daalo
        for (int num : nums1) {
            set.add(num);
        }

        // Intersection ko isi Set mein rakh do
        HashSet<Integer> result = new HashSet<>();

        for (int num : nums2) {
            if (set.contains(num)) {
                result.add(num);
            }
        }

        // Set → int[]
        int[] ans = new int[result.size()];

        int i = 0;
        for (int num : result) {
            ans[i++] = num;
        }

        return ans;
    }
}