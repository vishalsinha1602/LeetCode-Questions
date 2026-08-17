class Solution {
    public int[] sortedSquares(int[] nums) {

        int i = 0;
        int j = nums.length - 1;

        int[] result = new int[nums.length];

        int k = nums.length - 1;

        while (i <= j) {

            int square1 = nums[i] * nums[i];
            int square2 = nums[j] * nums[j];

            if (square1 < square2) {
                result[k] = square2;
                j--;
            } else {
                result[k] = square1;
                i++;
            }

            k--;
        }

        return result;
    }
}