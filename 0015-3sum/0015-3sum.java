class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int k = 0; k < nums.length - 2; k++) {

            // k agar 0 se bda hai aur abhi nums[k] phle nhi aya hai 
            if (k > 0 && nums[k] == nums[k - 1]) {
                continue;
            }

            int i = k + 1;
            int j = nums.length - 1;

            while (i < j) {

                int sum = nums[k] + nums[i] + nums[j];

                if (sum == 0) {

                    result.add(
                        Arrays.asList(nums[k], nums[i], nums[j])
                    );

                    i++;
                    j--;

                    // Skip duplicate i
                    while (i < j && nums[i] == nums[i - 1]) {
                        i++;
                    }

                    // Skip duplicate j
                    while (i < j && nums[j] == nums[j + 1]) {
                        j--;
                    }

                } 
                else if (sum < 0) {
                    i++;
                } 
                else {
                    j--;
                }
            }
        }

        return result;
    }
}