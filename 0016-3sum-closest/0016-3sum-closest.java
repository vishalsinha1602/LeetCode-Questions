class Solution {
    public int threeSumClosest(int[] nums, int target) {

        Arrays.sort(nums);
        int minDifference = Integer.MAX_VALUE;
        int answer = 0;
        for( int k = 0 ; k < nums.length-2 ; k++)
        {

            int i = k+1;
            int j = nums.length-1;

            while(i<j){

                int sum =  nums[k] + nums[i] + nums[j];
                
                int difference = Math.abs(target-sum);
                

                if(difference < minDifference)
                {
                    minDifference = difference;
                    answer = sum;
                }
                else if(sum==target)
                {
                    return sum;
                }

                if(sum<target)
                {
                    i++;
                }

                else
                {
                    j--;
                }


            }


        }

        return answer;
        
    }
}