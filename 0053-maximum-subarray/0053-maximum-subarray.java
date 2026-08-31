class Solution {
    public int maxSubArray(int[] nums) {

        // kadane algorithm
        // choice 1: ya toh phle wale ke sath continue kro
        // choice 2: ya toh abhi wale ke sath start kro

        int currentSum = nums[0];
        int maxSum = currentSum;

        for( int i = 1; i < nums.length; i++)
        {
            currentSum = Math.max(currentSum+nums[i] , nums[i]);
            maxSum = Math.max(maxSum,currentSum);

        }

        return maxSum;
        

    }
}