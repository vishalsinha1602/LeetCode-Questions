import java.util.*;

class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        int len1 = nums1.length;
        int len2 = nums2.length;

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

       
        if (len1 < len2) {
            for (int num : nums1) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            for (int num : nums2) {
                if (map.getOrDefault(num, 0) > 0) {
                    result.add(num);
                    map.put(num, map.get(num) - 1);
                }
            }

        } else {
            for (int num : nums2) {
                map.put(num, map.getOrDefault(num, 0) + 1);
            }

            for (int num : nums1) {
                if (map.getOrDefault(num, 0) > 0) {
                    result.add(num);
                    map.put(num, map.get(num) - 1);
                }
            }
        }

      
        int[] ans = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            ans[i] = result.get(i);
        }

        return ans;
    }
}