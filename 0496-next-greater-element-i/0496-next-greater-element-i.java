class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] ans = new int[nums1.length];

        for(int i=0;i<=nums1.length-1;i++)
        {
        
            int idx=-1;

            for(int j=0;j<=nums2.length-1;j++)
            {
                if(nums1[i]==nums2[j])
                {
                    idx=j;

                    break;
                }
            }

            ans[i]=-1;

            for(int j=idx+1 ;j<=nums2.length-1;j++)
            {
                if(nums2[j]>nums1[i])
                {
                    ans[i]=nums2[j];
                    break;
                }
            }



        }

    return ans;
        
    }
} 