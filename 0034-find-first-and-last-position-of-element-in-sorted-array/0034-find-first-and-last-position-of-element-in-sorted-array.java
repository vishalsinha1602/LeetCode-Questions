class Solution {
    public int[] searchRange(int[] nums, int target) {

        int first = first_occurence(nums, target);

        int last = last_occurence(nums, target);

        return new int[] {first, last};
    }

    public int first_occurence(int[] nums, int target)
    {
        // low low low low equal equal equal equal high high high high

        int high = nums.length-1;
        int low = 0;
        int ans=-1;

        while(low<=high)
        {
            int mid = low + (high-low)/2;

            if(nums[mid]==target)
            {
                ans=mid;
                high=mid-1;
            }
            else if(nums[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }

        return ans;

    }

    int last_occurence(int[] nums, int target)
    {
        // low low low low equal equal equal equal high high high high
        int high=nums.length-1;
        int low=0;
        int ans=-1;

        while(low<=high)
        {
            int mid= low + (high-low)/2;

            if(nums[mid]==target)
            {
                ans=mid;
                low=mid+1;
            }
            else if(nums[mid]<target)
            {
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }

        }

        return ans;

    }
}