class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        
        int left = 0;
        int right = k-1;
        int sum=0;
        int count = 0 ;

        for(int i = left ; i <= right ;i++)
        {
            sum+=arr[i];

           
        }

        if(sum>=threshold*k)
            count ++;

        while(right<arr.length-1)
        {
            sum-=arr[left];
            left++;
            right++;

            sum+=arr[right];

            if(sum>=threshold*k)
            count ++;
        }

        return count;

    }
}