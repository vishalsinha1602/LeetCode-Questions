class Solution {
    public int findMaxLength(int[] nums) {

        int zero = 0;
        int one = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        // diff = 0 initially
        map.put(0, -1);

        int res = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 0) {
                zero++;
            } else {
                one++;
            }

            int diff = zero - one;

            // diff already exists
            if (map.containsKey(diff)) {

                int idx = map.get(diff);

                res = Math.max(res, i - idx);

            } else {

                // first occurrence only
                map.put(diff, i);
            }
        }

        return res;
    }
}