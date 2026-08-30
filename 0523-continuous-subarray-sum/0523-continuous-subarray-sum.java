class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();

        // remainder 0 exists before array starts
        map.put(0, -1);

        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {

            prefixSum += nums[i];

            int rem = prefixSum % k;

            if (map.containsKey(rem)) {

                int previousIndex = map.get(rem);

                // subarray length >= 2
                if (i - previousIndex >= 2) {
                    return true;
                }

            } else {
                // only store FIRST occurrence
                map.put(rem, i);
            }
        }

        return false;
    }
}