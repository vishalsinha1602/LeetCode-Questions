class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int left = 0 ;
        int right = k-1;
        int sum=0;

        for(int i = left ;i<=right;i++)
        {
            sum+=nums[i];
        }

        double maxSum = sum;

        while(right<nums.length-1)
        {
            sum -= nums[left];
            left++;
            right++;

            sum+=nums[right];

            maxSum=Math.max(sum,maxSum);

        }


        return maxSum/k;
        
    }
}