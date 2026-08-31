class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> key = new HashSet<>();

        for(int num:nums)
        {
            if(key.contains(num))
            {
               return true;
            }

             key.add(num);
        }

        return false;
    }
}